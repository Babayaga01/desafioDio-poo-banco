package com.dio.desafioBanco;

public abstract class Conta implements IConta {

    protected static String AGENCIA = "101-0";
    protected static String NUM_CONTA = "00";

    protected String numConta;
    protected String agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numConta = NUM_CONTA;
        this.agencia = AGENCIA;
        this.saldo = 0;
        this.cliente = cliente;
    }

    protected void imprimeInfos() {
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numConta);
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Documento: " + this.cliente.getDocumento());
        System.out.println("Saldo Disponivel: " + this.saldo);
    }

    public String getNumConta() {
        return numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
