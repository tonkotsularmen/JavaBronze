public class Exercise4_6_A {
  public static void main(String[] args) {
    int num = 1;
    System.out.println("num = " + num);
    for (int i = 0; i < 3; ++i) {
      System.out.println("num = " + i);
      i *= 2;
      System.out.println("i *= = " + i);
    }
    System.out.println("num = " + (num++));
  }
}
