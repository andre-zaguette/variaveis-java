import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int numero;
    float saldo;
    String valor = "Descomplica - Java";

    numero = 1;
    saldo = 1.1f;

    System.out.println("Hello world!");
    System.out.println(numero);
    System.out.println(saldo);
    System.out.println(valor);
    System.out.println(valor.contains("Java"));
    System.out.println(valor.length());

    System.out.println("Informe seu Nome");
    Scanner entrada = new Scanner(System.in);
    String nome = entrada.nextLine();
    entrada.close();
    System.out.println("Seu nome é: " + nome);
  }
}