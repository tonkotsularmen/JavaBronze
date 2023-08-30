class Exercise4_6 {
  public static void main(String[] args) {
    int num = 1;
    System.out.println("num = " + num);
    for (num = 0; num < 3; ++num) {
      System.out.println("num = " + num);
      num *= 2;
      System.out.println("num *= = " + num);
    }
    System.out.println("num = " + (num++));
  }
}
