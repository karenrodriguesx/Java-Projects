import entity.Aluno;
import entity.Bootcamp;
import entity.Curso;
import entity.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setNome("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setNome("Angular");
        curso2.setDescricao("Curso de Angular");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setNome("Liderança");
        mentoria.setDescricao("Aprenda liderança");
        mentoria.setData(LocalDate.parse("09-01-2024"));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Trilha Java");
        bootcamp.setDescricao("Desenvolvimento Java e SpringBoot");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Aluno aluno = new Aluno();
        aluno.setNome("Fulana");
    }
}