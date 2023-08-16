class Sample4_6 {
  public static void main(String[] args) {
    int count1 = 0;

    for (; count1 < 5 ; count1++) { // 式1を省略 3行目で事前に初期化しているため
      System.out.print(count1);
    }
    System.out.println();// 改行
    for (int count2 = 0; count2 < 5;) { // 式3を省略 処理文ないでcount2を更新している
      System.out.print(count2++);
    }
  }
}
