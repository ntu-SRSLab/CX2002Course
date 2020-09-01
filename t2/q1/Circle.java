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
	System.out.println("The area is " + area());
    }
    public void printCircumference() {
	System.out.println("The circumference is " + circumference());
    }
}
