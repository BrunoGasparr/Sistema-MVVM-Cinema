import models.Filme;
import models.Sessao;
import models.Usuario;
import viewmodels.CarrinhoViewModel;
import viewmodels.CatalogoViewModel;
import views.CarrinhoIngressoView;
import views.CatalogoFilmesView;

import java.time.LocalDateTime;
import java.util.List;

public class Testes {
    public static void main(String[] args) {
        CatalogoViewModel viewModel = new CatalogoViewModel();
        CatalogoFilmesView view = new CatalogoFilmesView(viewModel);

        Filme filme1 = new Filme("Duna: Parte 2", "Ficção Científica", "Muita areia", 166, 14);
        Filme filme2 = new Filme("Oppenheimer", "Drama Histórico", "Essa dança que é uma bomba", 180, 18);

        List<Filme> filmes = List.of(filme1, filme2);

        viewModel.atualizarCatalogo(filmes);

        viewModel.selecionarFilmeId(1);

        CarrinhoViewModel carrinhoViewModel = new CarrinhoViewModel();
        CarrinhoIngressoView carrinhoView =  new CarrinhoIngressoView(carrinhoViewModel);

        Usuario usuario = new Usuario(1, "Lorenzo", "1234", "lor@enzo");
        List<Sessao> sessoes = List.of(
                new Sessao(filme1, 10.0, LocalDateTime.now(), 1, 10),
                new Sessao(filme2, 15, LocalDateTime.now(), 2, 15)
        );

        carrinhoViewModel.atualizarSessoes(sessoes);

        carrinhoViewModel.setUsuarioLogado(usuario);

        carrinhoViewModel.comprarIngressos(0, 2);

        carrinhoViewModel.comprarIngressos(1, 3);

        carrinhoViewModel.pagarCarrinho();
    }
}
