package org.example;

public class Pagamento {
    public Comprovante processar(Compra compra){
        int parcelas = compra.getParcelas();
        double valor = compra.getTotal();
        double taxa = buscarTaxa(parcelas);
        double valorFinal = calcularValorFinal(compra, taxa);
        double valorParcelas = calcularValorParcelas(valorFinal, parcelas);
        Comprovante comprovante = new Comprovante();

        comprovante.setTotalFinal(valorFinal);
        comprovante.setValorParcela(valorParcelas);

        return comprovante;
    }

    private double buscarTaxa(int parcelas){
        double taxa = 0;
        if(parcelas == 0){
            taxa = 0;
        }else if (parcelas < 3){
            taxa = 0.03;
        }else if ( parcelas < 12){
            taxa = 0.05;
        } else if (parcelas > 12) {
            taxa = 0.10;
        }
        return taxa;
    }
    private double calcularValorFinal(Compra compra, double taxa){
        double porcentagem= 0;
        double totalFinal = 0;
        porcentagem = compra.getTotal() * taxa;
        totalFinal = compra.getTotal() + porcentagem;
        return totalFinal;
    }
    private double calcularValorParcelas(double totalFinal, int parcelas){
        double valorParcelas = 0;
        valorParcelas = totalFinal/parcelas;

        return valorParcelas;
    }
}
