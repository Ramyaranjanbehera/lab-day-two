import java.util.Scanner;

public class Two {
  public static void main(String[] args) {
    long n, s;
    Scanner sc = new Scanner(System.in);
    System.out.println("write ur number");
    n = sc.nextLong();
    for (s = 0; n != 0; n = n / 10) {
      s = s + n % 10;
    }
    System.out.println("sum of digit" + s);

  }
}