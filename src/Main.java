import models.Filme;
import models.Sessao;
import models.Usuario;
import viewmodels.CarrinhoViewModel;
import viewmodels.CatalogoViewModel;
import views.CarrinhoIngressoView;
import views.CatalogoFilmesView;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main() {
        CatalogoViewModel catalogoViewModel = new CatalogoViewModel();
        CatalogoFilmesView catalogoView = new CatalogoFilmesView(catalogoViewModel);
        CarrinhoViewModel carrinhoViewModel = new CarrinhoViewModel();
        CarrinhoIngressoView carrinhoView =  new CarrinhoIngressoView(carrinhoViewModel);
        Usuario usuario = new Usuario(1, "usuario", "1234", "usuario@gmail.com");
        carrinhoViewModel.setUsuarioLogado(usuario);
        Filme filme1 = new Filme("Duna: Parte 2", "Ficção Científica", "Muita areia", 166, 14);
        Filme filme2 = new Filme("Oppenheimer", "Drama Histórico", "Essa dança que é uma bomba", 180, 18);
        List<Filme> filmes = List.of(filme1, filme2);
        List<Sessao> sessoes = List.of(
                new Sessao(filme1, 10.0, LocalDateTime.now(), 1, 10),
                new Sessao(filme2, 15, LocalDateTime.now(), 2, 15)
        );
        catalogoViewModel.setFilmes(filmes);
        carrinhoViewModel.setSessoes(sessoes);

        Scanner sc = new Scanner(System.in);
        String tela = "inicio";
        int opcao;
        boolean rodando = true;

        while (rodando){
            switch (tela) {
                case "inicio":
                    System.out.println("====== BEM-VINDO, ESCOLHA UMA OPÇÃO ======");
                    System.out.println("1- Ver catálogo de filmes\n2- Comprar ingressos\n3- Sair");
                    System.out.println("==========================================");
                    opcao = sc.nextInt();
                    System.out.println();
                    switch (opcao) {
                        case 1:
                            catalogoViewModel.atualizarCatalogo(catalogoViewModel.getFilmes());
                            tela = "catalogo";
                            break;
                        case 2:
                            carrinhoViewModel.atualizarSessoes(carrinhoViewModel.getSessoes());
                            tela = "sessoes";
                            break;
                        case 3:
                            System.out.println("Saindo...");
                            rodando = false;
                            break;
                    }
                    break;
                case "catalogo":
                    System.out.println("1- Voltar ao início\n2- Selecionar filme");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println();
                            tela = "inicio";
                            break;
                        case 2:
                            System.out.println("Digite o número do filme:");
                            int filmeSelecionado = sc.nextInt();
                            System.out.println();
                            catalogoViewModel.selecionarFilmeId(filmeSelecionado);
                            break;
                    }
                    break;
                case "sessoes":
                    System.out.println("1- Voltar ao início\n2- Comprar ingressos\n3- Pagar carrinho");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            System.out.println();
                            tela = "inicio";
                            break;
                        case 2:
                            System.out.println("Digite o número da sessão:");
                            int idSessao = sc.nextInt();
                            System.out.println("Digite a quantidade de ingressos:");
                            int quantidadeIngressos = sc.nextInt();
                            System.out.println();
                            carrinhoViewModel.comprarIngressos(idSessao, quantidadeIngressos);
                            break;
                        case 3:
                            System.out.println();
                            double valorTotal = carrinhoViewModel.calcularValorCarrinho();
                            if (valorTotal > 0) {
                                System.out.printf("Pagando %.2f reais em ingressos no carrinho...\n\n", valorTotal);
                                carrinhoViewModel.pagarCarrinho();
                            } else {
                                System.out.println("Carrinho vazio...\n");
                            }
                    }
            }
        }
    }
}
