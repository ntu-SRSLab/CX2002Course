public class Cylinder extends Circle {
  private double height;

  public Cylinder() { height = 1; }
  public Cylinder(double h) { height = h; }
  // note the use of super
  public Cylinder(double h, double r) {
    super(r) ;
    height = h;
  }
  public Cylinder(double h, double r, int a, int b)  {
    super(r,a,b);
    height = h;
  }

  public double getHeight() { return height; }
  public void setHeight(double height) { this.height = height; }

  // area
  public double area() {
    // note the use of super
    return 2 * (super.area()+
                Math.PI * super.getRadius() * height);
  }
  //volume
  public double volume() { return super.area() * height; }

  public String toString() {
    return "Cylinder of height " + height +
	", radius " + getRadius() +
	" at point [" + x + "," + y + "]";
  }
}
