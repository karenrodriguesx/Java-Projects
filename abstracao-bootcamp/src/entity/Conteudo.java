package entity;

public abstract class Conteudo {

    public static final double XP_PADRAO = 10d;

    private String nome;
    private String descricao;

    public abstract double calcularXP();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
