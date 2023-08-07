import java.util.*;

public class nota_alunos {
  public static void main(String[] args) {
    java.util.Scanner scanner = new Scanner(System.in);

    float nota1, nota2, nota3;
    float media;
    System.out.println("nota 1:");
    nota1 = scanner.nextFloat();
    System.out.println("nota 2:");
    nota2 = scanner.nextFloat();
    System.out.println("nota 3:");
    nota3 = scanner.nextFloat();

    scanner.close();

    media = (nota1 + nota2 + nota3) / 3;

    String formatMedia = String.format("%.2f", media);

    System.out.println(formatMedia);
  }
}
