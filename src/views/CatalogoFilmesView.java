package views;

import viewmodels.CatalogoViewModel;

import java.util.ArrayList;
import java.util.List;

public class CatalogoFilmesView {
    private final CatalogoViewModel viewModel;
    private List<String> exibicaoFilmes = new ArrayList<>();
    private String filmeSelecionado = "Nenhum filme selecionado.";

    public CatalogoFilmesView(CatalogoViewModel viewModel) {
        this.viewModel = viewModel;
        this.viewModel.addPropertyChangeListener(evt -> {
            switch (evt.getPropertyName()) {
                case "listaFilmes":
                    this.exibicaoFilmes = (List<String>) evt.getNewValue();
                    renderizarCatalogo();
                    break;
                case "filmeSelecionado":
                    this.filmeSelecionado = (String) evt.getNewValue();
                    renderizarCatalogo();
            }
        });
    }

    private void renderizarCatalogo() {
        System.out.println("============ CATÁLOGO DE FILMES ============");
        for (int i = 0; i < this.exibicaoFilmes.size(); i++) {
            System.out.println((i+1) + "- " + this.exibicaoFilmes.get(i));
        }
        System.out.println("============================================");
        System.out.println("====== DESCRIÇÃO DO FILME SELECIONADO ======");
        System.out.println(this.filmeSelecionado);
        System.out.println("============================================");
    }
}
