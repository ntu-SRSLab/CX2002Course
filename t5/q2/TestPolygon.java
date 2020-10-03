public class TestPolygon {
  public static void printArea(Rectangle rect) {
    float area = rect.calArea( );
    System.out.println("The area of the " + rect.getPolytype()
                       + " is " + area);
  }

  public static void printArea(Triangle tri) {
    float area = tri.calArea( );
    System.out.println("The area of the " + tri.getPolytype()
                       + " is " + area);
  } 

}
