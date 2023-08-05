public class loop {
  public static void main(String[] args) {
    int iwhile = 1;
    int idowhile = 1;
    while (iwhile < 6) {
      System.out.println(iwhile);
      iwhile++;
    }
    do{
      System.out.println(idowhile);
      idowhile++;
    }
    while (idowhile < 6);

    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println(i);
    }


    String[] cars = {"Volvo", "bmw", "ford"};
    for (String car: cars) {
      System.out.println(car);
    }

    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }
      System.out.println(i);
    }
  }
}
