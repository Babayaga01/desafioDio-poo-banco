package com.dio.desafioBanco;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Cliente henrique = new Cliente("Henrique", "1234");
        Cliente joyce = new Cliente("Joyce", "123");
        Cliente lorena = new Cliente("Lorena", "12");
        Cliente larissa = new Cliente("Larissa", "1");

        Conta conta = new ContaCorrente(henrique);
        Conta conta3 = new ContaPoupanca(lorena);
        Conta conta2 = new ContaCorrente(joyce);
        Conta conta4 = new ContaPoupanca(larissa);

        Banco banco1 = new Banco("ComRoupaBank");

        banco1.setContas(conta);
        banco1.setContas(conta2);
        banco1.setContas(conta3);
        banco1.setContas(conta4);

        banco1.listaContas();

        conta.depositar(1000);
        conta.transferir(500, conta2);
        conta.sacar(50);

        conta3.depositar(100);

        banco1.listaContas();

    }
}
