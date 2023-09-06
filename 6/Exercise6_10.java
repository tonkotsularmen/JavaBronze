class Foo2 {
  Foo2() {
    System.out.println("Hello");
  }

  private Foo2(String str) {
    System.out.println("Bye");
  }
}

class Exercise6_10 {
  public static void main(String[] args) {
    Foo2 f2 = new Foo2();
  }
}
