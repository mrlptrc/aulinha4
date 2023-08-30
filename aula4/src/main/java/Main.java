import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("===== PROGRAMA DO ORÁCULO =====");

        Pessoa p = new Pessoa();

        System.out.println("Nome:");
        p.setNome(ler.next());

        System.out.println("Dia do Nasc.:");
        p.setDia(ler.nextInt());

        System.out.println("Mês do Nasc.:");
        p.setMes(ler.nextInt());

        System.out.println("Ano do Nasc.:");
        p.setAno(ler.nextInt());


        Oraculo oraculo = new Oraculo();
        Info info = oraculo.analisar(p);


        System.out.println("=== Oraculo diz:");
        System.out.println("=== Esse ano voce completa " + info.getIdade() + " anos.");
        System.out.println("=== Voce e da geracao " + info.getGeracao());
        System.out.println("=== Seu signo e " + info.getSigno());


    }
}