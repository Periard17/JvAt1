import java.util.Scanner;
public class At2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n,s;
    System.out.println("Digite o nome do usuário: ");
    n = scanner.nextLine();
    System.out.println("Digite a senha do usuário: ");
    s = scanner.nextLine();
    if (n.equals(s)) {
      System.out.println("Nome e senha não podem ser iguais.");
    }  else {
      System.out.println("Nome e senha válidos.");
    } 
    while (n.equals(s));
  }
  
}  

    