package dogs;

public class Main {
  public static void main(String[] args) {
    System.out.println(Dog.bark);

    Dog dottie;

    dottie = new Dog("Springer", 10, "Black and White");
    Dog ginger = new Dog("Troller", 6, "Ginger");

    dottie.bark = "bark";

    System.out.println(dottie.bark);
    System.out.println(Dog.bark);

    System.out.println(dottie);
    System.out.println(dottie.getAge());

    ginger.bark = "gingerBark";

    ginger.setBreed("mutt");
    System.out.println(ginger.getBreed());
    System.out.println(Dog.bark);

  }
}