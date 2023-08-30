package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        Compra compra = new Compra();

        System.out.println("Valor Inicial: ");
        compra.setTotal(sc.nextDouble());

        System.out.println("Quantidade parcelas: ");
        compra.setParcelas(sc.nextInt());

        Pagamento pag = new Pagamento();
        Comprovante comprovante = pag.processar(compra);

        System.out.println("Valor final é de: " + comprovante.getTotalFinal());
        System.out.println("Valor de cada parcela: " + comprovante.getValorParcela());
    }
}