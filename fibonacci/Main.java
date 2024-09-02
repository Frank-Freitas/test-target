public class Main {

  // 1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a
  //soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um
  //programa na linguagem que desejar onde, informado um número, ele calcule a sequência de
  //Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

  public static void main(String[] args) {

    long numeroInformado = 267914296, vezes = 99, fibo = 0,aux = 0,aux2 = 1;
    
    boolean sequencia = false;

    for (int i = 0; i < vezes; i++) {
      System.out.println(aux);
      System.out.println(aux2);
      fibo = aux + aux2;
      if (aux == numeroInformado || aux2 == numeroInformado || fibo == numeroInformado) {
        sequencia = true;
      }

      boolean cont = true;

      while (cont) {
        System.out.println(fibo);
        aux = fibo + aux2;
        aux2 = fibo + aux;
        cont = false;
      }
    }

    System.out.println("Número informado: " + numeroInformado);
    if (sequencia == false) {
      System.out.println("o número informado não pertence a sequência.");
    } else {
      System.out.println("o número informado pertence a sequência.");
    }
  }
}
