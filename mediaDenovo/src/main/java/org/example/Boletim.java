package org.example;

public class Boletim {
    public Resultado processar(NotasAluno notas){
        double media = this.calcularMedia(notas);
        String situacao = this.verificarSituacao(media, notas.getFaltas());

        Resultado resultado = new Resultado();

        resultado.setMedia(media);
        resultado.setSituacao(situacao);
        return resultado;
    }

    private double calcularMedia(NotasAluno notas){
        double media;
        media = (notas.getNota1() + notas.getNota2() + notas.getNota3()) / 3;
        return media;
    }

    private String verificarSituacao(double media, int faltas){
        NotasAluno notas = new NotasAluno();
        faltas = notas.getFaltas();
        media = calcularMedia(notas);
        String situacao = "";
        if (media > 6){
            situacao="Aluno aprovado!";
        } else if (media < 6) {
            situacao="DP por nota";
        }else if (faltas > 4){
            situacao = "DP por faltas";
        }

        return situacao;
    }
}
