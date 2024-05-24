package com.elian.dio;

public class Curso extends Conteudo {
    private int cargaHoraria;
    @Override
    public double calcularXp() {
        return cargaHoraria * XP_PADRAO;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                "titulo="+ getTitulo() +
                "descricao="+ getDescricao() +
                '}';
    }
}
