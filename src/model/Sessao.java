package model;

import java.time.LocalDateTime;

public class Sessao {
    private Filme filme;
    private LocalDateTime data;
    private int sala;
    private int numeroAssentos;

    public Sessao(Filme filme, LocalDateTime data, int sala, int numeroAssentos) {
        this.filme = filme;
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
}
