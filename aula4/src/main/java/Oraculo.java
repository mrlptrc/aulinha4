public class Oraculo {
    private int verIdade(Pessoa p){
      int idade = 2023 - p.getAno();
        return idade;
    }

    private String verSigno(Pessoa p){
        String signo= "";
        if (p.getDia() >= 21 && p.getMes() == 1 || p.getDia() <= 19 && p.getMes() == 2){
            signo = "Aquário";
        }else if (p.getDia() >= 20 && p.getMes() == 2 || p.getDia() <= 20 && p.getMes() == 3){
            signo = "Peixes";
        }else if (p.getDia() >= 21 && p.getMes() == 3 || p.getDia() <= 20 && p.getMes() == 4){
            signo = "Áries";
        }else if (p.getDia() >= 21 && p.getMes() == 4 || p.getDia() <= 20 && p.getMes() == 5){
            signo = "Touro";
        }else if (p.getDia() >= 21 && p.getMes() == 5 || p.getDia() <= 20 && p.getMes() == 6){
            signo = "Gemeos";
        }else if (p.getDia() >= 21 && p.getMes() == 6 || p.getDia() <= 21 && p.getMes() == 7){
        signo = "Cancer";
        }else if (p.getDia() >= 22 && p.getMes() == 7 || p.getDia() <= 22 && p.getMes() == 8){
            signo = "Leao";
        }else if (p.getDia() >= 23 && p.getMes() == 8 || p.getDia() <= 22 && p.getMes() == 9){
            signo = "Virgem";
        }else if (p.getDia() >= 23 && p.getMes() == 9 || p.getDia() <= 22 && p.getMes() == 10){
            signo = "Libra";
        }else if (p.getDia() >= 23 && p.getMes() == 10 || p.getDia() <= 21 && p.getMes() == 11){
            signo = "Escorpiao";
        }else if (p.getDia() >= 22 && p.getMes() == 11 || p.getDia() <= 21 && p.getMes() == 12){
            signo = "Sagitario";
        }else if (p.getDia() >= 22 && p.getMes() == 12 || p.getDia() <= 20 && p.getMes() == 1){
            signo = "Capricornio";
        }
        return signo;
    }

    private String verGeracao(Pessoa p){
        int ano = p.getAno();

        String geracao = "";
        //19401980 /1980 1997 /1998 2002
        if (p.getAno() >= 1940 && p.getAno() <= 1959){
            geracao = "Baby Boomers";
        } else if (p.getAno() >= 1960 && p.getAno() <= 1979) {
            geracao = "X";
        }else if (p.getAno() >= 1980 && p.getAno() <= 1995) {
            geracao = "Y";
        }else if (p.getAno() >= 1996 && p.getAno() <= 2010) {
            geracao = "Z";
        }else if (p.getAno() >= 2010) {
            geracao = "Alfa";
        }else{
            geracao = "idoso centenario";
        }
        return geracao;
    }

//    private int verNumerologia(Pessoa p){
//        p.getAno();
//        p.getMes();
//        p.getDia();
//        int numerologia;
//     return numerologia;
//    }

        public Info analisar(Pessoa p){

        int idade = this.verIdade(p);
        String signo = this.verSigno(p);
        String geracao = this.verGeracao(p);

        Info info = new Info();
        info.setIdade(idade);
        info.setSigno(signo);
        info.setGeracao(geracao);

        return info;
    }
}
