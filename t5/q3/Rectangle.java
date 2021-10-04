public class Rectangle extends Polygon {
  public Rectangle(String theName, float theWidth, float theHeight) {
    super(theName, theWidth, theHeight);
    this.polytype = KindofPolygon.POLY_RECT;
  }

  public float calArea() {
    return width * height;
  }
}