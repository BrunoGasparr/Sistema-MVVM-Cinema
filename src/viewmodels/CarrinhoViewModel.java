package viewmodels;

import models.Filme;
import models.Ingresso;
import models.Sessao;
import models.Usuario;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoViewModel {
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private Usuario usuarioLogado;
    private List<Sessao> sessoes = new ArrayList<>();
    private List<String> exibicaoSessoes = new ArrayList<>();
    private List<Ingresso> carrinho = new ArrayList<>();
    private List<String> exibicaoCarrinho = new ArrayList<>();

    public void atualizarSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
        this.exibicaoSessoes.clear();
        for (Sessao sessao : sessoes) {
            this.exibicaoSessoes.add(sessao.getFilme().getTitulo());
        }
        support.firePropertyChange("listaSessoes", null, this.exibicaoSessoes);
    }

    public void atualizarCarrinho(List<Ingresso> carrinho) {
        this.carrinho = carrinho;
        this.exibicaoCarrinho.clear();
        for (Ingresso ingresso : carrinho) {
            this.exibicaoCarrinho.add(ingresso.toString());
        }
        support.firePropertyChange("listaCarrinho", null, this.exibicaoCarrinho);
    }

    public void comprarIngressos(int id, int quantidade){
        id-=1;
        if (sessoes.get(id).getNumeroAssentos()>=quantidade && (this.usuarioLogado!=null)){
            for (int i=1; i<=quantidade; i++){
                Ingresso novoIngresso = new Ingresso(String.valueOf(i), sessoes.get(id), usuarioLogado);
                carrinho.add(novoIngresso);
            }
            sessoes.get(id).setNumeroAssentos(sessoes.get(id).getNumeroAssentos() - quantidade);
            atualizarCarrinho(carrinho);
        }
    }

    public void pagarCarrinho(){
        for (Ingresso ingresso : carrinho) {
            usuarioLogado.getIngressos().add(ingresso);
        }
        carrinho.clear();
        atualizarCarrinho(carrinho);
    }

    public double calcularValorCarrinho(){
        double valorCarrinho = 0;
        for (Ingresso ingresso : carrinho) {
            valorCarrinho += ingresso.getSessao().getPreco();
        }
        return valorCarrinho;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
