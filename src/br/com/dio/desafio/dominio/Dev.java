package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    // LinkedHashSet porque queremos que os cursos sejam salvos na ordem de entrada
        // Não escolhi ArrayList porque não quero que seja possível inserir itens repetidos
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Quando se inscrever num Bootcamp, inserir todos os conteudos do Bootcamp no Set de conteudos inscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        // Quando se inscrever adicionar este Dev ao Set DevsIncritos do Bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        // Se houver conteudosIncritos
        if (conteudo.isPresent()) {
            // Dos ConteudosInscritos removemos o conteudo e adicionamos a Conteudos Concluidos
            this.conteudosInscritos.remove(conteudo.get());
            this.conteudosConcluidos.add(conteudo.get());
        } else {
            System.err.println("Você não está inscrito em nenhum curso ou mentoria");
        }
    }

    public double calcularTotalXp () {
           return this.conteudosConcluidos
                   .stream()
                   .mapToDouble(Conteudo::calcularXp)
                   .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}

