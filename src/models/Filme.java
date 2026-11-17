package models;

public class Filme {
    private String titulo;
    private String genero;
    private String descricao;
    private int duracaoMinutos;
    private int classificacaoIndicativa;

    public Filme(String titulo, String genero, String descricao, int duracaoMinutos, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.genero = genero;
        this.descricao = descricao;
        this.duracaoMinutos = duracaoMinutos;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) { this.classificacaoIndicativa = classificacaoIndicativa; }

    @Override
    public String toString() {
        return "%s\nGênero:%s\nDuração: %d minutos\nClassificação Indicativa: %s\nSinopse: %s".formatted(
                getTitulo(),  getGenero(), getDuracaoMinutos(), getClassificacaoIndicativa(), getDescricao()
        );
    }

}
