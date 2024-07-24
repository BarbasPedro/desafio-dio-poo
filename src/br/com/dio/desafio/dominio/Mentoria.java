package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public void setData(LocalDate data) {
        this.data = LocalDate.from(data.atStartOfDay());
    }

    public LocalDateTime getData() {
        return data.atStartOfDay();
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
