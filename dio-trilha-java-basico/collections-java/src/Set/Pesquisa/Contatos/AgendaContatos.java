package Set.Pesquisa.Contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //attributes
    private Set<Contato> contatoSet;

    //constructors
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //methods
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    //Testes
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();



        agendaContatos.adicionarContato("Contato 1 ", 100);
        agendaContatos.adicionarContato("Contato 2 ", 200);
        agendaContatos.adicionarContato("Contato 3 ", 300);
        agendaContatos.adicionarContato("Número 4", 400);

        System.out.println(agendaContatos.pesquisarPorNome("Contato"));
        agendaContatos.atualizarNumeroContato("Contato 2 ", 2200);

       agendaContatos.exibirContatos();

    }



}
