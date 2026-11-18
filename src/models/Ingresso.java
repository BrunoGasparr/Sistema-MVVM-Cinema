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

    @Override
    public String toString() {
        return "Ingresso para sessão de %s às %2$td/%2$tm/%2$tY às %2$tH:%2$tM".formatted(sessao.getFilme().getTitulo(), sessao.getData());
    }
}
