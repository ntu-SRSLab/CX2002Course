public class Test{

  public static void main(String args[]){
    Circle testCircle1 = new Circle();
    Circle testCircle2 = new Circle(35, 2, 4);

    System.out.println(testCircle1.toString());
    System.out.println("Area of Circle 1 = " + testCircle1.area());

    System.out.println(testCircle2.toString());
    System.out.println("Area of Circle 2 = " + testCircle2.area());
  }
}
