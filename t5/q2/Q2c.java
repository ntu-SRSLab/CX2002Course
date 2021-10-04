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

public class Q2c {
  public static void main(String[] args) {
    // // Q2c.i
    // ClassC c = new ClassD(); // upcast -- ok
    // ClassE e = c; // downcast -- not ok! implicit

    // // Q2c.ii
    // ClassB b = new ClassE(); // different family lines -- not ok!
    // b.print("hello");

    // // Q2c.iii
    // ClassA a1 = new ClassF(); // upcast -- ok
    // a1.print(12, "there"); // ok
    // a1.print(88); // no definition!

    // // Q2.iv
    // ClassA a2 = new ClassC(); // upcast -- ok
    // ClassG g1 = (ClassG)a2; // explicit downcast -- ok; runtime not ok
    // g1.print("hello"); // compiler ok; runtime not ok

    // // Q2.v
    // ClassA a3 = new ClassC(); // upcast -- ok
    // ClassG g2 = (ClassG)a3; // explicit downcast -- ok; runtime not ok
    // g2.print("hello", "there");

    // Q2.vi
    ClassA a4 = new ClassF(); // upcast -- ok
    ClassC f = (ClassC)a4; // explicit downcast -- ok; runtime is ok
    f.print(88, "there"); // ClassA
    // f.print("hello", "there"); // ClassC
  }
}
