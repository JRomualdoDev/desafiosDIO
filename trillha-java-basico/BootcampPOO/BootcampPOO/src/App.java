import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("--------------------------------");
        Dev dev1 = new Dev();
        dev1.setNome("Dev1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudoInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdo Concluidos: " + dev1.getConteudoConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("--------------------------------");
        dev1.avaliacaoConteudo(5, "Curso Java");
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudoInscritos());

        Dev dev2 = new Dev();
        dev2.setNome("Dev2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdo Concluidos: " + dev2.getConteudoConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        System.out.println("--------------------------------");
        dev2.avaliacaoConteudo(5, "Curso Java");
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudoInscritos());

    }
}
