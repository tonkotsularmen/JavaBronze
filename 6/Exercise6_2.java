class Exercise6_2 {
  boolean var;

  // varは明示的に初期化されていませんが、インスタンス変数のためfalseで初期化されています。s
  public static void main(String[] args) {
    Exercise6_2 obj = new Exercise6_2();
    if (obj.var == true) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}
