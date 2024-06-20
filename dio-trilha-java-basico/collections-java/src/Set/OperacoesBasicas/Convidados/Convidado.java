package Set.OperacoesBasicas.Convidados;

import java.util.Objects;

public class Convidado {
    //attributes
    private String nome;
    private int codigoConvite;

    //constructors
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    //equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    //toString

    @Override
    public String toString() {
        return nome + codigoConvite;
    }
}
