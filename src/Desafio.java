import java.util.Scanner;

public class Desafio {
    static void main(String[] args) {
        int operacao = 0;

        String msgInicial = """
                
                ***********************
                Dados iniciais do cliente:
                
                Nome: Murilo
                Tipo conta: Corrente
                Saldo inicial: """;
        String msgFinal = """
                
                ***********************
                
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
        double saldo = 2500.00;
        double valor = 0;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem vindo!");

        while(operacao != 4){
            System.out.println(msgInicial + saldo + msgFinal);
            operacao = leitura.nextInt();
            switch (operacao) {
                case 1:
                    System.out.println("O seu saldo é " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    valor = leitura.nextDouble();
                    saldo -= valor;
                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 4:
                    System.out.println("Você está saindo. Até breve.");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }

    }
}

//solucção da alura: https://github.com/alura-cursos/2858-java-desafio/blob/main/src/Desafio.java
