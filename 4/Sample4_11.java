class Sample4_11 {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      if ((i % 3) == 0) {
        System.out.println("この処理をスキップします");
        continue; // continueによりfor文の式3へ制御を移します。
      }
      System.out.println("i = " + i);
    }
    System.out.println("for文の後の処理");
  }
}
