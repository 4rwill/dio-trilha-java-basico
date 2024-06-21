package Set.Pesquisa.Tarefas;

public class Tarefa {
    //attributes
    private String descricao;
    private boolean concluido;

    //constructors
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = concluido;
    }

    //getters and setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }
    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    //toString
    @Override
    public String toString() {
        return descricao + concluido;
    }
}
