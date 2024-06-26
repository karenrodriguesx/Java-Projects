package entity;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO * 5;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                "titulo=" + getNome() +
                "descricao=" + getDescricao() +
                '}';
    }
}
