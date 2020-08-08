package dogs;

public class Dog {
  public static String bark = "Woof";

  private String breed;
  private int age;
  private String color;

  public Dog() {
  };

  public Dog(String color) {
    this.age = 1;
    this.breed = "mutt";
    this.color = color;
  };

  public Dog(String breed, int age, String color) {
    this.age = age;
    this.color = color;
    this.breed = breed;
  };

  public String getBreed() {
    return breed;
  };

  public void setBreed(String breed) {
    this.breed = breed;
  };

  public int getAge() {
    return age;
  };

  public void setAge(int age) {
    this.age = age;
  };

  public String getColor() {
    return color;
  };

  public void setColor(String color) {
    this.color = color;
  };

  public void sleep(int minutes) {
    System.out.println("ZZZ" + minutes);
  };

}