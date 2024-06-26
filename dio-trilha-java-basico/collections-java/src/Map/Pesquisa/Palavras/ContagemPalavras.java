package Map.Pesquisa.Palavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //attributes
    private Map<String, Integer> contagemPalavrasMap;

    //constructors
    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    //methods
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemPalavrasMap);
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    //Testes
    public static void main(String[] args) {
    ContagemPalavras contagemPalavras = new ContagemPalavras();

    contagemPalavras.adicionarPalavra("Java", 4);
    contagemPalavras.adicionarPalavra("JS", 6);
    contagemPalavras.adicionarPalavra("Ruby", 1);

    System.out.println(contagemPalavras.encontrarPalavrasMaisFrequente());
    contagemPalavras.removerPalavra("Ruby");

    contagemPalavras.exibirContagemPalavras();
    }


}
