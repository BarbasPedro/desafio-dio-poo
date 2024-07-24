package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição Curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("Curso JavaScript");
        cursoJavaScript.setDescricao("Descrição Curso JavaScript");
        cursoJavaScript.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Descrição Mentoria Java");
        mentoriaJava.setData(LocalDate.now());

        Mentoria mentoriaJavaScript = new Mentoria();
        mentoriaJavaScript.setTitulo("Mentoria JavaScript");
        mentoriaJavaScript.setDescricao("Descrição Mentoria JavaScript");
        mentoriaJavaScript.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoriaJava);

        Bootcamp bootcampJavaScript = new Bootcamp();
        bootcampJavaScript.setNome("Bootcamp JavaScript Developer");
        bootcampJavaScript.setDescricao("Descrição Bootcamp JavaScript Developer");
        bootcampJavaScript.getConteudos().add(cursoJavaScript);
        bootcampJavaScript.getConteudos().add(mentoriaJavaScript);

        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        dev1.setNome("Pedro");
        dev2.setNome("Sheri");

        dev1.inscreverBootcamp(bootcampJava);

        dev2.inscreverBootcamp(bootcampJavaScript);

        System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

        dev1.progredir();
        dev2.progredir();

        System.out.println(" ");
        System.out.println("########################################");
        System.out.println(" ");

        System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

        System.out.println(" ");
        System.out.println("########################################");
        System.out.println(" ");

        dev1.progredir();

        System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}