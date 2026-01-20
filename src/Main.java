//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//void main() {
//  //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//  // to see how IntelliJ IDEA suggests fixing it.
//  IO.println(String.format("Hello and welcome!"));
//
//  for (int i = 1; i <= 5; i++) {
//    //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//    // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//    IO.println("i = " + i);
//  }
//}

public class Main {
  public static void main(String[] args) {
    System.out.println("Esse é o Screen Match");
    System.out.println("Filme: Divertidamente");

    int anoDeLancamento = 2022;
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    boolean incluidoNoPlano = true;
    double notaDoFilme = 8.2;

    //AULA 2
    double media = (9.2 + 8.3 + 5) / 3;
    System.out.println(media);

    String sinopse;
    sinopse = """
            Filme de aventura com 
            galã dos anos 80
            """;

    System.out.println(sinopse);


    int classificacao = (int) (media / 2);
    System.out.println(classificacao);


    //Desafio aula 2
    System.out.println("Desafio aula 2");
    //1. e 2.
    double nota1 = 5.2;
    int nota2 = 9;
    int mediaDesafio =( (int) (nota1) + nota2 ) / 2;
    System.out.println("1. e 2. media desafio: " + mediaDesafio);

    //3.
    char letra = 'M';
    String palavra = "S";
    System.out.println("3." + letra + palavra);

    //4.
    double precoProduto = 126.14;
    int quantidade = 3;
    System.out.println("preço total: " +precoProduto * quantidade);

    //5.
    double valorEmDolares = 5.25;
    System.out.println("valor em reais: " + valorEmDolares*4.94);

    //6.






  }
}
