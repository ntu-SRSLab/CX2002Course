public class Circle 
{
  private double radius;
  private static final double PI = 3.14159;
	
  public Circle(double rad) {
    radius = rad;
  }	
  public void setRadius(double rad) {
    radius = rad;
  }	
  public double getRadius() {
    return radius;
  }	
  public double area() {
    return PI * radius * radius;
  }
  public double circumference() {
    return 2 * PI * radius;
  }
  public void printArea() {
    System.out.println("Area of circle");
    System.out.println("Radius: " + radius);
    System.out.println("Area: " + area());
  }
  public void printCircumference() {
    System.out.println("Circumference of circle");
    System.out.println("Radius: " + radius);
    System.out.println("Circumference: " + circumference());
  }
}
