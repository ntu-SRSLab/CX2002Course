public class Circle {
  protected Point centre;
  protected double radius;
  
  public Circle() {
    this.centre = new Point();
    this.radius = 1;
  }

  public Circle(double radius) {
    this.centre = new Point();
    this.radius = radius;
  }
  // note the use of super
  public Circle(double radius, int a, int b) {
    this.centre = new Point(a, b);
    this.radius = radius;
  }

  public double getRadius() { return radius; }
  public void setRadius(double radius) { this.radius = radius;}

  public double area() {
    return Math.PI * Math.pow(radius, 2);
  }
  public String toString(){
    return "Circle of radius " + radius
	+ " at point [" + centre.getX() + ","
	+ centre.getY() + "]";
  }
}
