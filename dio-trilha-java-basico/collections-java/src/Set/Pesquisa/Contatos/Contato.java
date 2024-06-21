package Set.Pesquisa.Contatos;

import java.util.Objects;

public class Contato {
    //attributes
    private String nome;
    private int numero;

    //contructors
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
    //setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }


    //toString

    @Override
    public String toString() {
        return nome + numero;
    }
}
