package List.Ordenacao.DeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //attributes
    private List<Integer> numeros;

    //constructors
    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(numeros);
        Collections.sort(numerosDescendente, Collections.reverseOrder());
        return numerosDescendente;
    }

    //TESTE
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(1);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }


}
