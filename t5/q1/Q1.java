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

class ClassC extends ClassA {
  void print(String x, String y) {
    System.out.print("ClassC: ");
    System.out.println(x + ", " + y);
  }
}

class ClassD extends ClassC {
  void print(String a, String b) {
    System.out.print("ClassD: ");
    System.out.println(a + ", " + b);
  }
}

class ClassE extends ClassC {
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
}

class ClassG extends ClassE {
  void print(String x) {
    System.out.print("ClassG: ");
    System.out.println(x);
  }
}

public class Q1 {
  public static void main(String[] args) {
    ClassF z = new ClassF();

    // Q1(a)
    z.print(9); // ClassF
    // Q1(b)
    z.print(2, "Cx2002"); // ClassA
    // Q1(c)
    z.print("Object"); // ClassE
    // Q1(d)
    z.print("OODP", "Java"); // ClassC
    // Q1(e)
    // z.print("OODP", 2002); // Compilation error!
  }
}
