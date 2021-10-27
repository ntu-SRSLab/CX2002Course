#include <iostream>
#include <string>

using namespace std;

enum KindofPolygon
{
  POLY_PLAIN,
  POLY_RECT,
  POLY_TRIANG
};
string StringKindofPolygon[] = {"POLY_PLAIN", "POLY_RECT", "POLY_TRIANG"};

class Polygon
{

protected:
  string name;
  float width;
  float height;
  KindofPolygon polytype;

public:
  Polygon(string theName, float theWidth, float theHeight) : name(theName)
  {
    width = theWidth;
    height = theHeight;
    polytype = POLY_PLAIN;
  }

  KindofPolygon getPolytype()
  {
    return polytype;
  }

  void setPolytype(KindofPolygon value)
  {
    polytype = value;
  }

  string getName() { return name; }

  virtual float calArea() = 0;

  void printWidthHeight()
  {
    cout << "Width = " << width << " Height = " << height << endl;
  }
};

class Rectangle : public Polygon
{
public:
  Rectangle(string theName, float theWidth,
            float theHeight) : Polygon(theName, theWidth, theHeight)
  {
    polytype = POLY_RECT;
  }

  float calArea() { return width * height; }
};

class Triangle : public Polygon
{
public:
  Triangle(string theName, float theWidth,
           float theHeight) : Polygon(theName, theWidth, theHeight)
  {
    polytype = POLY_TRIANG;
  }

  float calArea() { return 0.5f * width * height; }
};

class TestPolygon
{
public:
  static void printArea(Polygon &poly)
  {
    float area = poly.calArea();
    cout << "The area of the " << StringKindofPolygon[poly.getPolytype()] << " is " << area << endl;
  }
};

int main()
{

  Rectangle rect1("Rect1", 3.0f, 4.0f);
  rect1.printWidthHeight();
  TestPolygon::printArea(rect1);

  Triangle triang1("Triang1", 3.0f, 4.0f);
  triang1.printWidthHeight();
  TestPolygon::printArea(triang1);

  system("read -p 'Press Enter to continue...' var");
  //cin.get();
}
