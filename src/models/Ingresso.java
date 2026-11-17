package models;

public class Ingresso {
    private String assento;
    private Sessao sessao;
    private Usuario usuario;

    public Ingresso(String assento, Sessao sessao, Usuario usuario) {
        this.assento = assento;
        this.sessao = sessao;
        this.usuario = usuario;
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
