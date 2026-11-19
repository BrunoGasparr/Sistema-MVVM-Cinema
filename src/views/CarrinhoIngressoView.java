package views;

import models.Sessao;
import models.Usuario;
import viewmodels.CarrinhoViewModel;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoIngressoView {
    private final CarrinhoViewModel viewModel;
    private List<String> exibicaoSessoes = new ArrayList<>();
    private List<String> exibicaoCarrinho = new ArrayList<>();

    public CarrinhoIngressoView(CarrinhoViewModel viewModel) {
        this.viewModel = viewModel;
        this.viewModel.addPropertyChangeListener( evt -> {
            switch (evt.getPropertyName()) {
                case "listaSessoes":
                    this.exibicaoSessoes = (List<String>) evt.getNewValue();
                    renderizarCarrinho();
                    break;
                case "listaCarrinho":
                    this.exibicaoCarrinho = (List<String>) evt.getNewValue();
                    renderizarCarrinho();
            }
        });
    }

    private void renderizarCarrinho() {
        System.out.println("============ SESSÕES DISPONÍVEIS ============");
        for (int i = 0; i < this.exibicaoSessoes.size(); i++) {
            System.out.println((i+1) + "- " + this.exibicaoSessoes.get(i));
        }
        System.out.println("============================================");
        System.out.printf("=========== CARRINHO DE usuario ===========\n");
        for (String descricaoIngresso : this.exibicaoCarrinho) {
            System.out.println("- " + descricaoIngresso);
        }
        System.out.println("============================================");
    }
}
