#include <iostream>

using namespace std;

class A {
protected:
  int a, b;

public:
  A (int x, int y) { // rightmost for default value
    a = x;
    b = y;
  }

  virtual void print();

  friend int doubleIt(A a);  // use ‘friend’ to show, but not good practice

  // friend A operator+(const A _a1, const A _a2);
  
  A operator+(const A _a) const {
    int aa = a + _a.a;
    int bb = b + _a.b;

    return A(aa, bb);
  }
};

// A operator+(const A _a1, const A _a2) {
//   int aa = _a1.a + _a2.a;
//   int bb = _a1.b + _a2.b;

//   return A(aa, bb);
// }

class B: public A {
private:
  float p, q;

public:
  B(int m, int n, float u, float v) : A(m, n) {
    p = u;
    q = v;
  }

  B() : A(0,0) { p = q = 0; }

  void input(float u, float v);

  virtual void print();
};

void A::print(void) {
  cout << "A values: " << a << " " << b << "\n" ;
}

void B::print() {
  cout << "B values : " << p << " " << q << "\n" ;
}

void B::input(float x, float y) {
  p = x;
  q = y;
}

int doubleIt(A a) { return a.a * a.a ; } // ref to top

int main() {
  A a1(10, 20), *ptr, a2(30, 10);
  B b1;
  b1.input(7.5, 3.142) ;

  ptr = &a1;
  ptr->print();
  ptr = &b1;
  ptr->print();

  (a1 + a2).print();
}
