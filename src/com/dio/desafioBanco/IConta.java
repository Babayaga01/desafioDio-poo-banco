package com.dio.desafioBanco;

public interface IConta {

    void sacar(double valor);

    void transferir(double valor, Conta conta);

    void depositar(double valor);

    void imprimeDados();
}
