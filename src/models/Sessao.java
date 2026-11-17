package models;

import java.time.LocalDateTime;

public class Sessao {
    private Filme filme;
    private double preco;
    private LocalDateTime data;
    private int sala;
    private int numeroAssentos;

    public Sessao(Filme filme, double preco, LocalDateTime data, int sala, int numeroAssentos) {
        this.filme = filme;
        this.preco = preco;
        this.data = data;
        this.sala = sala;
        this.numeroAssentos = numeroAssentos;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getNumeroAssentos() {
        return numeroAssentos;
    }

    public void setNumeroAssentos(int numeroAssentos) {
        this.numeroAssentos = numeroAssentos;
    }

    @Override
    public String toString() {
        return "Sessão %s\nPreço: %.2f\nData: %1$td/%1$tm/%1$tY às %1$tH:%1$tM\nSala: %d\nAssentos Disponíveis: %d".formatted(
                getFilme().getTitulo(), getPreco(), getData(), getSala(), getNumeroAssentos()
        );
    }
}
