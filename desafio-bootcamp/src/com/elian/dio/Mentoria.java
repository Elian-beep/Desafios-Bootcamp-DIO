package com.elian.dio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate dataMentoria) {
        this.data = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "dataMentoria=" + data +
                "titulo="+ getTitulo() +
                "descricao="+ getDescricao() +
                '}';
    }
}
