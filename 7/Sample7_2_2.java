class Super2 {
  // サブクラスではスーパークラスで定義したメンバ変数と同じ名前を持つメンバ変数も宣言が可能
  int i;

  public void print(String s) {
    System.out.println("Super print : " + s);
  }

  public void method() {
  }
}

class Sub2 extends Super2 {
  int i;

  public void print(String s) {
    s = "渡された文字列は" + s + "です。";
    System.out.println("Sub print : " + s);
  }

  // コンパイルエラー
  // void method() {
  // }
}

class Sample7_2_2 {
  public static void main(String[] args) {
    Super2 s1 = new Super2();
    s1.print("Java"); // 2行目が呼び出される
    Sub2 s2 = new Sub2();
    s2.print("Java"); // 11行目が呼び出される
  }
}
