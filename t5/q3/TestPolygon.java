public class TestPolygon {

  // Static binding
  public static void printArea(Rectangle rect) {
    float area = rect.calArea();
    System.out.println("The area of the " + rect.getPolytype() + " is " + area);
  }

  public static void printArea(Triangle tri) {
    float area = tri.calArea();
    System.out.println("The area of the " + tri.getPolytype() + " is " + area);
  }

  // Dynamic binding
  // public static void printArea(Polygon poly) {
  //   float area = poly.calArea();
  //   System.out.println("The area of the " + poly.getPolytype() + " is " + area);
  // }

  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle("Rect1", 3.0f, 4.0f);
    printArea(rect1); // static binding
    rect1.printWidthHeight();

    Triangle triang1 = new Triangle("Triang1", 3.0f, 4.0f);
    printArea(triang1); // static binding
    triang1.printWidthHeight();
  }
}