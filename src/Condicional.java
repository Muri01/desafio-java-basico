public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.2;
        String tipoPlano = "plus+";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamentos novos");
        } else {
            System.out.println("Filme antigo");
        }


        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("pode assitir");
        } else{
            System.out.println("precisa pagar");
        }

        // Para saber mais
        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);
    }
}
