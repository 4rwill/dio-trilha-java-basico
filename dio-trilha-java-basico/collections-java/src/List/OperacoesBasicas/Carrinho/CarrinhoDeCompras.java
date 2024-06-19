package List.OperacoesBasicas.Carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itensList;

    public CarrinhoDeCompras(){
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itensList.add(new Item (nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itensList) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itensList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itensList.isEmpty()) {
            for (Item item : itensList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

   public void exibirItens(){
       System.out.println(itensList);
   }

   //TESTE

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("bota", 2.0, 1 );
        carrinhoDeCompras.adicionarItem("tenis", 2.0, 1 );
        carrinhoDeCompras.adicionarItem("camisa", 3.5, 1 );
        carrinhoDeCompras.removerItem("tenis");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }



}
