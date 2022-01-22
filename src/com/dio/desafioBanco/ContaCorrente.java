package com.dio.desafioBanco;

public class ContaCorrente extends Conta {

    private static int SEQUECIAL = 1;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        String seq = Integer.toString(SEQUECIAL++);
        super.numConta = Conta.NUM_CONTA + seq;
    }

    @Override
    public void sacar(double valor) {
        if (super.saldo < valor) {
            System.out.println("Saldo Indisponivel");
        } else {
            saldo -= valor;
        }
    }

    @Override
    public void transferir(double valor, Conta conta) {
        if (super.saldo < valor) {
            System.out.println("Saldo Indisponivel");
        } else {
            super.saldo -= valor;
            conta.saldo += valor;
        }

    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;

    }

    @Override
    public void imprimeDados() {
        System.out.println("====== Conta Corrente ======");
        super.imprimeInfos();
    }
}
