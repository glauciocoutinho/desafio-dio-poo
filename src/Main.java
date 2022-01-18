import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.getData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Paulo: " + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());

        System.out.println("--------------------");

        Dev devMarlene = new Dev();
        devMarlene.setNome("Marlene");
        devMarlene.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marlene: " + devMarlene.getConteudosInscritos());
        devMarlene.progredir();
        devMarlene.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marlene: " + devMarlene.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marlene: " + devMarlene.getConteudosConcluidos());
        System.out.println("XP: " + devMarlene.calcularTotalXp());

        System.out.println("--------------------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());


    }
}
