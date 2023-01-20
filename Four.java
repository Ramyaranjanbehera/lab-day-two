public class Four {
  public static void main(String... args) {
    int r, c;

    for (r = 1; r <= 5; r++) {

      // insted of number of row I take r
      for (c = 5; c >= r; c--) {
        System.out.print("*");

      }
      System.out.println();

    }
  }
}
