class Exercise6_15 {
  private static int a;
  private int b;

  public static int methodA() {
    return ++a;
  }

  public int methodB() {
    return methodA();
  }

  public static void main(String[] args) {
    Exercise6_15 obj = new Exercise6_15();
    System.out.print(obj.methodB() + " ");
    System.out.print(obj.methodA());
  }
}
