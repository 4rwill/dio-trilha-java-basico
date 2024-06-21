package Set.Ordenacao.Alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //attributes
    private Set<Aluno> alunoSet;

    //constructors
    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    //methods
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()){
            for (Aluno a : alunoSet){
                if (a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else{
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunoParaRemover == null){
        System.out.println("Matricula não encontrada!");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }

    //TESTES

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos= new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 100L, 2.0  );
        gerenciadorAlunos.adicionarAluno("Bruno", 200L, 3.0  );
        gerenciadorAlunos.adicionarAluno("Caio", 300L, 1.0  );

        gerenciadorAlunos.removerAluno(100L);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
