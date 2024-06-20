package Set.OperacoesBasicas.Convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //attributes
    private Set<Convidado> convidadoSet;

    //constructors
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //methods
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    //TESTE
    public static void main(String[] args) {
       ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
       //add
        conjuntoConvidados.adicionarConvidado("Convidado 1 ", 123);
        conjuntoConvidados.adicionarConvidado("Convidado 2 ", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 3 ", 12345);
        conjuntoConvidados.adicionarConvidado("Convidado 4 ", 123456);
        conjuntoConvidados.adicionarConvidado("Convidado 5 ", 1234567);
        conjuntoConvidados.adicionarConvidado("Convidado 6 ", 1234567);
        //remove
        //conjuntoConvidados.removerConvidadoPorCodigoConvite(123);

        //exibir e contar
        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();





        System.out.println("Existem " +conjuntoConvidados.contarConvidados()+ " dentro do Set de Convidados");

    }


}
