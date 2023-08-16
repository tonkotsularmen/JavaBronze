class Sample4_12 {
  public static void main(String[] args) {
    loop1:
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        System.out.println("x = " + x + "y = " + y);
        if (x == 1 && y == 1) {
          System.out.println("breakの実行");
          break loop1;
        }
      }
    }
    System.out.println("-------------------------------");
    loop2:
    for (int x = 0; x < 3; x++) {
      for (int y = 0; y < 3; y++) {
        System.out.println("x = " + x + "y = " + y);
        if (x == 1 && y == 1) { // ifの位置で実行結果が変わる
          System.out.println("continueの実行");
          continue loop2;
        }
      }
    }
  }
}
