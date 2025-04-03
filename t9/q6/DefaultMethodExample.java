interface Vehicle {
  default void start() {
    System.out.println("Vehicle started.");
  }
}

interface Transportation {
  default void start() {
    System.out.println("Transportation started.");
  }
}

class Car implements Vehicle {
  @Override
  public void start() {
    System.out.println("Car started.");
  }
}

public class DefaultMethodExample {

  public static void main(String[] args) {
    Vehicle car = new Car();
    car.start(); // Output: Car started.
  }
}
