public class Polygon {
  public enum KindofPolygon { POLY_PLAIN, POLY_RECT,
                              POLY_TRIANG};
  protected String name;
  protected float width;
  protected float height;
  protected KindofPolygon polytype;

  public Polygon(String theName, float theWidth, float theHeight) {
    name = theName;
    width = theWidth;
    height = theHeight;
    polytype = KindofPolygon.POLY_PLAIN;
  }

  public KindofPolygon getPolytype() {
    return polytype;
  }

  public void setPolytype(KindofPolygon value) {
    polytype = value;
  }

  public String getName() { return name; }

  public float calArea() { return 0; }

  public void printWidthHeight( ) {
    System.out.println("Width = " + width + " Height = " +
                       height);
  }
}
