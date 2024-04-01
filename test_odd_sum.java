import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int x, y, soma, troca, i;

    System.out.print("Digite dois numeros: ");
    x = sc.nextInt();
    y = sc.nextInt();

    if (x > y) {
      troca = x;
      x = y;
      y = troca;
    }

    soma = 0;
    for (i = x + 1; i < y; i++) {
      if (i % 2 != 0) {
        soma += i;
      }
    }

    System.out.print("A soma dos impares é:" + soma);

    sc.close();
  }
}