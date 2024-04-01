import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    double altura,base,area,perimetro,diametro;

    System.out.print("Digite a base do retangulo: ");
    base = sc.nextDouble();
    System.out.print("Digite a altura do retangulo: ");
    altura = sc.nextDouble();

    area = base * altura;
    perimetro = 2 * (base + altura);
    diametro = Math.sqrt(Math.pow(base,2.0) +         Math.pow(altura,2.0) );

    System.out.println("Suas medidas:");
    System.out.println("AREA: " + String.format("%.2f",area));
    System.out.println("PERIMETRO: " + String.format("%.2f",perimetro));
    System.out.println("DIAMETRO: " + String.format("%.2f",diametro) );

    sc.close();
  }
}