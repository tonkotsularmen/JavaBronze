class Test3 {
  int instanceVal = 100;
  static int staticVal = 200;

  void methodA() {
    System.out.println("methodA():" + instanceVal);
  }

  static void methodB() {
    System.out.println("methodB():" + staticVal);
  }
}

class Sample6_6 {
  public static void main(String[] args) {
    // System.out.println(Test3.instanceVal); // NG
    System.out.println(Test3.staticVal); // OK
    // Test3.methodA(); // NG
    Test3.methodB(); // OK
    System.out.println("-------------------------");
    Test3 t = new Test3(); // OK
    System.out.println(t.instanceVal); // OK
    System.out.println(t.staticVal); // OK
    t.methodA(); // OK
    t.methodB(); // OK
  }
}
