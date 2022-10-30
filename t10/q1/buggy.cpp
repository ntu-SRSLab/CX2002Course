#include <iostream.h>

class A {
protected: 
  int a, b;

public:
  A(int x=0, int y) {
    a = x;
    b = y;
  }

  virtual void print();
};

class B: public A {
private:
  float p, q;

public:
  B(int m, int n, float u, float v) {
    p = u;
    q = v;
  }

  B() { p = q = 0; }

  void input(float u, float v);

  virtual void print(float);
};

void A::print(void) {
  cout << "A values: " << a << " " << b << "\n" ;
}

void B::print(float) {
  cout << "B values : " << u << " " << v << "\n" ;
}

void B::input(float x, float y) {
  p = x;
  q = y;
}

int doubleIt(A a) { return a.a * a.a; }

main() {
  A a1(10, 20), *ptr;
  B b1;
  b1.input(7.5, 3.142) ;

  ptr = &a1 ;
  ptr->print() ;
  ptr = &b1;
  ptr->print() ;
}
