class ClassA {
  void print(int x, String y) {
    System.out.print("ClassA: ");
    System.out.println(x + ", " + y);
  }
}

class ClassB extends ClassA {
  void print(int x) {
    System.out.print("ClassB: ");
    System.out.println(x);
  }
}

abstract class ClassC extends ClassA {
  abstract void print(String x, String y);
}

class ClassD extends ClassC {
  void print(String a, String b) {
    System.out.print("ClassD: ");
    System.out.println(a + ", " + b);
  }
}

abstract class ClassE extends ClassC {
  void print(String x) {
    System.out.print("ClassE: ");
    System.out.println(x);
  }
}

class ClassF extends ClassE {
  void print(int x) {
    System.out.print("ClassF: ");
    System.out.println(x);
  }

  void print(String a, String b) {
    System.out.print("ClassD: ");
    System.out.println(a + ", " + b);
  }
}

class ClassG extends ClassE {
  void print(String x) {
    System.out.print("ClassG: ");
    System.out.println(x);
  }

  void print(String a, String b) {
    System.out.print("ClassD: ");
    System.out.println(a + ", " + b);
  }
}

public class Q2a {
  public static void main(String[] args) {
  }
}
