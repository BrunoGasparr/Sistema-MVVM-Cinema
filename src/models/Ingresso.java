package models;

public class Ingresso {
    private String id;
    private double preco;
    private String assento;
    private Sessao sessao;
    private Usuario usuario;

    public Ingresso(String id, double preco, String assento, Sessao sessao, Usuario usuario) {
        this.id = id;
        this.preco = preco;
        this.assento = assento;
        this.sessao = sessao;
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
