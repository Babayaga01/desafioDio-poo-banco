package com.dio.desafioBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nomeBanco;
    List<Conta> contas;

    public Banco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
        this.contas = new ArrayList<>();
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public void setContas(Conta conta) {
        this.contas.add(conta);
    }

    public void listaContas() {
        for (Conta conta : this.contas) {
            conta.imprimeDados();
        }

    }
}
