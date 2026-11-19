package viewmodels;

import models.Filme;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class CatalogoViewModel {
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private List<Filme> filmes = new ArrayList<>();
    private List<String> exibicaoFilmes = new ArrayList<>();
    private String filmeSelecionado;

    public CatalogoViewModel() {}

    public void atualizarCatalogo(List<Filme> filmes) {
        this.filmes = filmes;
        this.exibicaoFilmes.clear();
        for (Filme filme : filmes) {
            this.exibicaoFilmes.add(filme.getTitulo());
        }
        support.firePropertyChange("listaFilmes", null, this.exibicaoFilmes);
    }

    public void selecionarFilmeId(int id) {
        id-=1;
        if (id >= 0 && id < this.filmes.size()) {
            this.filmeSelecionado = this.filmes.get(id).toString();
            support.firePropertyChange("filmeSelecionado", null, this.filmeSelecionado);
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}
