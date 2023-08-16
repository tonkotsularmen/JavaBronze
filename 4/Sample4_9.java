class Sample4_9 {
  public static void main(String[] args) {
    for (int i = 0; ; i++) { // 式2が省略されているので無限ループする
      if (i == 3) {
        break; // break;によりfor文から抜ける。if文から抜けるのではない。
      }
      System.out.println("i = " + i);
    }
    System.out.println("for文の後の処理");
  }
}
