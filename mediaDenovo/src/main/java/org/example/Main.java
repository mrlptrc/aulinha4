package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== PROGRAMA DA MEDIA =====");

        NotasAluno notas = new NotasAluno();

        System.out.println("Nota 1:");
        notas.setNota1(ler.nextDouble());

        System.out.println("Nota 2:");
        notas.setNota2(ler.nextDouble());

        System.out.println("Nota 3:");
        notas.setNota3(ler.nextDouble());

        System.out.println("Quantidade de faltas:");
        notas.setFaltas(ler.nextInt());

        Boletim bol = new Boletim();
        Resultado res = bol.processar(notas);

        System.out.println("sua média foi: " + res.getMedia());
        System.out.println("sua situacao é: " + res.getSituacao());
    }
}