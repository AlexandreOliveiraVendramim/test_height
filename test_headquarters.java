import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int i, j, M, quant;

    System.out.print("Como será sua matriz: ");
    M = sc.nextInt();

    int[][] matriz = new int[M][M];

    for (i = 0; i < M; i++) {
      for (j = 0; j < M; j++) {
        System.out.print("ELEMENTO [" + i + "][" + j + "]:");
        matriz[i][j] = sc.nextInt();
      }
    }

    System.out.println("Diagonal: ");
    for (i = 0; i < M; i++) {
      System.out.print(+matriz[i][i] + " ");
    }

    System.out.println("Quantidade de negativos: ");
    quant = 0;
    for (i = 0; i < M; i++) {
      for (j = 0; j < M; j++) {
        if (matriz[i][j] < 0) {
          quant++;
        }
      }
    }
    System.out.print(" " + quant);

    sc.close();
  }

}