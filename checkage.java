import java.util.Scanner;

public class checkage {
  static void checkAge(int age) {
    if (age < 18) {
      System.out.println("Access denied");
    }
    else{
      System.out.println("Access granted");
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    checkAge(scanner.nextInt());
    scanner.close();
  }
}
