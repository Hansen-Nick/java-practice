package randoms;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random rand = new Random();

    System.out.println("min Int " + Integer.MIN_VALUE);
    System.out.println("max Int " + Integer.MAX_VALUE);

    int iresult = rand.nextInt();
    System.out.println(iresult);

    iresult = rand.nextInt(5);
    System.out.println(iresult);

    iresult = rand.nextInt(6) + 5;
    System.out.println(iresult);

    double dresult = rand.nextDouble();
    System.out.println(dresult);

  }
}
