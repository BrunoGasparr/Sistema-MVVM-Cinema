import models.Filme;
import viewmodels.CatalogoViewModel;
import views.CatalogoFilmesView;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CatalogoViewModel viewModel = new CatalogoViewModel();
        CatalogoFilmesView view = new CatalogoFilmesView(viewModel);

        List<Filme> filmes = List.of(
                new Filme("Duna: Parte 2", "Ficção Científica", "Muita areia", 166, 14),
                new Filme("Oppenheimer", "Drama Histórico", "Essa dança que é uma bomba", 180, 18)
        );

        viewModel.atualizarCatalogo(filmes);

        view.onUsuarioSelecionarFilme(1);
    }
}
