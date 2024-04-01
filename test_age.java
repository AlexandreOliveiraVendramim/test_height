import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int idade1, idade2;
    String nome1, nome2;
    double media;

    System.out.print("Qual o nome da primeira pessoa:");
    nome1 = sc.nextLine();
    System.out.print("Digite a idade da primeira pessoa:");
    idade1 = sc.nextInt();
    System.out.println("");

    System.out.print("Qual o nome da segunda pessoa:");
    sc.nextLine();
    nome2 = sc.nextLine();
    System.out.print("Digite a idade da segunda pessoa:");
    idade2 = sc.nextInt();
    System.out.println("");

    media = (double) (idade1 + idade2) / 2.0;
    System.out.println("Nome da primeira pessoa: " + nome1);
    System.out.println("Idade da primeira pessoa: " + idade1);
    System.out.println("Nome da segunda pessoa: " + nome2);
    System.out.println("Idade da segunda pessoa: " + idade2);
    System.out.print("A media das idades é: " + String.format("%.1f", media));

    sc.close();
  }
}