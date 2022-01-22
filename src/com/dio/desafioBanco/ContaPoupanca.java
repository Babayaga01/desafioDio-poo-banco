package com.dio.desafioBanco;

import java.util.Scanner;

public class ContaPoupanca extends Conta {

    private static int SEQUECIAL = 10;
    private static final double TAXA = 3.50d;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        String seq = Integer.toString(SEQUECIAL++);
        super.numConta = Conta.NUM_CONTA + seq;
    }

    @Override
    public void sacar(double valor) {
        if (super.saldo < valor) {
            System.out.println("Saldo Indisponivel");
        } else {
            System.out.println("É cobrada uma taxa de " + TAXA + " para essa operação\nDeseja continuar?");
            System.out.println("1 - SIM / 2 - NÃO");
            Scanner sc = new Scanner(System.in);
            int resposta = sc.nextInt();
            if (resposta == 1) {
                super.saldo -= (valor + TAXA);
            } else {
                System.out.println("Operação Cancelada");
            }
        }
    }

    @Override
    public void transferir(double valor, Conta conta) {
        if (super.saldo < valor) {
            System.out.println("Saldo Indisponivel");
        } else if (!super.numConta.equals(conta.getNumConta())) {
            System.out.println("É cobrada uma taxa de " + TAXA + " para essa operação\nDeseja continuar?");
            System.out.println("1 - SIM / 2 - NÃO");
            Scanner sc = new Scanner(System.in);
            int resposta = sc.nextInt();
            if (resposta == 1) {
                super.saldo -= (valor + TAXA);
                conta.saldo += valor;
            } else {
                System.out.println("Operação Cancelada");
            }
        } else {
            System.out.println("A conta informada é invalida");
        }
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }

    @Override
    public void imprimeDados() {
        System.out.println("====== Conta Poupanca ======");
        super.imprimeInfos();

    }


}
