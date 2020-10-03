class A {
  void print(int x, String y) {
    System.out.println(x + ", " + y);
  }
}

class B extends A {
  void print(int x) {
    System.out.println(x);
  }
}

class C extends A {
  void print(String x, String y) {
    System.out.println(x + ", " + y);
  }
}

class D extends C {
  void print(String a, String b) {
    System.out.println(a + ", " + b);
  }
}

class E extends C {
  void print(String x) {
    System.out.println(x);
  }
}

class F extends E {
  void print(int x) {
    System.out.println(x);
  }
}

class G extends E {
  void print(String x) {
    System.out.println(x);
  }
}

public class Q1 {
  public static void main(String[] args) {
    A a = new C();
    G g = (G)a;
    g.print("hello", "there");
  }
}
