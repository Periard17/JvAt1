import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.print("Digite uma nota entre 0 e 10: ");
    n = scanner.nextInt();
    while (n < 0 || n > 10) {
      System.out.print("Nota inválida. Digite uma nota entre 0 e 10: ");
      n = scanner.nextInt();
    }
    System.out.println("Nota válida: " + n);
  }
}
