import java.util.Scanner;

public class Leitura {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lancaçento: ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual é a avaliação do filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(anoDeLancamento);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
