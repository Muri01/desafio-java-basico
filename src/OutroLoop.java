import java.util.Scanner;

public class OutroLoop {
    static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0; // poderia ser i

        while(nota != -1) {
            System.out.println("Qual é a avaliação do filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();
            if(nota != - 1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Media da avaliação é " + mediaAvaliacao/totalDeNotas);

    }
}
