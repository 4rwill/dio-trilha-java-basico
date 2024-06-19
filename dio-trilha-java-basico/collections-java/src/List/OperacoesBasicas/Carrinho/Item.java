package List.OperacoesBasicas.Carrinho;

public class Item {
    //attributes
    private String nome;
    private double preco;
    private int quantidade;

    //constructors
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }



    //getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return nome;
    }
}
