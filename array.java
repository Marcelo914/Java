public class array {
  public static void main(String[] args) {
    String [] nomes = {"marcelo","souza", "pedro", "mari"};
    System.out.println(nomes[0]);
    nomes[0] = "tucuna";
    System.out.println(nomes[0]);
    System.out.println(nomes.length);

    for (String i: nomes) {
      System.out.println(i);
    }

    int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
  }
}
