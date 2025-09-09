package com.marlon.brasileirao.model;

public class Clube {
    private String nome;
    private int jogos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsPro;
    private int golsContra;
    private String escudoUrl;

    public Clube(String nome, int jogos, int vitorias, int empates, int derrotas, int golsPro, int golsContra, String escudoUrl) {
        this.nome = nome;
        this.jogos = jogos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
        this.escudoUrl = escudoUrl;
    }

    public String getNome() { return nome; }
    public int getJogos() { return jogos; }
    public int getVitorias() { return vitorias; }
    public int getEmpates() { return empates; }
    public int getDerrotas() { return derrotas; }
    public int getGolsPro() { return golsPro; }
    public int getGolsContra() { return golsContra; }
    public int getPontos() { return vitorias*3 + empates; }
    public int getSaldoGols() { return golsPro - golsContra; }
    public String getEscudoUrl() { return escudoUrl; }

    public void setJogos(int jogos) { this.jogos = jogos; }
    public void setVitorias(int vitorias) { this.vitorias = vitorias; }
    public void setEmpates(int empates) { this.empates = empates; }
    public void setDerrotas(int derrotas) { this.derrotas = derrotas; }
    public void setGolsPro(int golsPro) { this.golsPro = golsPro; }
    public void setGolsContra(int golsContra) { this.golsContra = golsContra; }
    public void setEscudoUrl(String escudoUrl) { this.escudoUrl = escudoUrl; }
}