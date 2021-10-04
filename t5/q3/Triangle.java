public class Triangle extends Polygon {
  public Triangle(String theName, float theWidth, float theHeight) {
    super(theName, theWidth, theHeight);
    this.polytype = KindofPolygon.POLY_TRIANG;
  }

  public float calArea() {
    return 0.5f * width * height;
  }
}