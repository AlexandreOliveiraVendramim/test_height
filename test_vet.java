import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int n,i;
    double soma,media;

    System.out.print("Digite a quantidade do vetor: ");
    n = sc.nextInt();

    double[] vet = new double[n];

    for (i=0; i < n; i++){
      System.out.print("Digite um valor: ");
      vet[i] = sc.nextDouble();
    };
    System.out.println("");
    
    System.out.print("VALORES:");
      for(i = 0; i < n; i++){
        System.out.print(" " +String.format("%.1f",vet[i]));
      };
      System.out.println("");

    System.out.print("SOMA:");
      soma = 0;
      for (i = 0; i < n; i++){
        soma = soma + vet[i];
      };
      System.out.print(String.format("%.1f",soma));
      System.out.println("");

    System.out.print("MEDIA:");
      media = soma/2;
      System.out.print(String.format("%.1f",media));

    sc.close();
  }
}