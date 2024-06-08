package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa christianWill = new Pessoa("12345678","Christian Will");

        christianWill.setEndereco("Rua das Ruas");

        System.out.println("Nome: " + christianWill.getNome() );
        System.out.println("CPF: " + christianWill.getCpf() );
        System.out.println("Endereço: " + christianWill.getEndereco() );
    }
}