package workingstrings;

import java.text.DecimalFormat;

public class Main {
  private static DecimalFormat df = new DecimalFormat("$#,##0.00");

  public static void main(String[] args) {
    String myString = "Lambda School";
    myString.charAt(0);
    System.out.println(myString);

    System.out.println(myString.charAt(0));

    System.out.println(myString.charAt(5));

    String strResult = myString.substring(5, 8);
    System.out.println(strResult);

    System.out.println(myString.length());

    strResult = myString + "John";
    System.out.println(strResult);

    strResult = myString.toLowerCase();
    System.out.println(strResult);

    double myDouble = 123134556.7890;
    strResult = df.format(myDouble);
    System.out.println(strResult);

    myDouble = .3;
    strResult = df.format(myDouble);
    System.out.println(strResult);
  }
}