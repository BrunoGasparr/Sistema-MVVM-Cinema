# Sistema MVVM Cinema

Aplicação de terminal em Java que simula a consulta ao catálogo de um cinema e a compra de ingressos. O projeto usa o padrão **MVVM (Model–View–ViewModel)** para separar os dados, a lógica da aplicação e a apresentação no console.

## Funcionalidades

- Listar os filmes do catálogo e consultar os detalhes de um título.
- Consultar as sessões disponíveis e selecionar a quantidade de ingressos.
- Adicionar ingressos ao carrinho, calcular o valor total e simular o pagamento.

O programa inicia com um usuário de demonstração e duas sessões de exemplo, para **Duna: Parte 2** e **Oppenheimer**.

## Como executar

Use o **JDK 25**, que permite executar o método `public static void main()` usado na classe `Main`. Confira a instalação com `java -version` e `javac -version`.

```bash
git clone https://github.com/BrunoGasparr/Sistema-MVVM-Cinema.git
cd Sistema-MVVM-Cinema

mkdir -p out
javac -encoding UTF-8 -sourcepath src -d out src/Main.java src/Testes.java
java -cp out Main
```

Se estiver usando o **IntelliJ IDEA**, abra a pasta do repositório, configure o JDK 25 como SDK do projeto e execute a classe `Main` em `src/Main.java`.

## Como usar

1. No menu inicial, escolha **Ver catálogo de filmes** para listar os títulos. Use **Selecionar filme** e informe o número exibido para consultar os detalhes.
2. Volte ao início e escolha **Comprar ingressos** para listar as sessões.
3. No menu de sessões, escolha **Comprar ingressos** e informe o número da sessão e a quantidade desejada.
4. Selecione **Pagar carrinho** para simular o pagamento dos ingressos adicionados.

## Estrutura do projeto

| Caminho | Responsabilidade |
| --- | --- |
| [`src/models/`](src/models/) | Representa os dados do domínio, como filmes, sessões e usuários. |
| [`src/viewmodels/`](src/viewmodels/) | Coordena a seleção de filmes, a consulta às sessões e as operações do carrinho. |
| [`src/views/`](src/views/) | Exibe o catálogo e as informações de compra no terminal. |
| [`src/Main.java`](src/Main.java) | Inicializa os dados de exemplo e controla a navegação pelos menus. |
| [`src/Testes.java`](src/Testes.java) | Executa um roteiro de demonstração do catálogo e da compra de ingressos. |

## Roteiro de demonstração

Após compilar o projeto, execute:

```bash
java -cp out Testes
```

A classe `Testes` percorre a listagem do catálogo, a seleção de um filme, a exibição de sessões, a compra de ingressos e o pagamento simulado. A saída é exibida no terminal para conferência.
