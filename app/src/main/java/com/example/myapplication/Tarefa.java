package com.example.myapplication;

public class Tarefa {
    private String dataInicial;
    private String dataFinal;
    private String descricao;
    private String titulo;

    public Tarefa(String dataInicial, String dataFinal, String descricao, String titulo) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.descricao = descricao;
        this.titulo = titulo;
    }

    public Tarefa() {
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
