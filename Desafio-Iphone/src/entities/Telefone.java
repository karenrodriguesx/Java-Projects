package entities;

public interface Telefone {
    public void fazerLigacao(String numero);

    public void atenderLigacao(String pessoa, String numero);

    public void adicionarContato(String nome, String numero);

    public void removerContato(String pessoa);

    public void colocarChamadaEmEspera();
}