class Extra1 {
  static int x = 0;

}

class Test {
  public static void main(String[] args) {
    int y = 0;
    System.out.println("x : " + x);
    System.out.println("y : " + y);
    System.out.println("------------------");
    x++;
    y++;
    System.out.println("x : " + x);
    System.out.println("y : " + y);
  }
}
