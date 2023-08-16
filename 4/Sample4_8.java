class Sample4_8 {
  public static void main(String[] args) {
    // 外側の制御文 for
    for (int i = 1; i < 10; i++) { 
    // int i = 0;にするとif文で i % 4 == 0がtrueになってしまう
      // 内側の制御文 if
      if ((i % 4) == 0) {
        System.out.println(i + " は ４の倍数です。");
      }
    }
  }
}
