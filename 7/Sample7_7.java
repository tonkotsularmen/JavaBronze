class Super3_2 {
  public Super3_2() {
    System.out.println("Super3_2()");
  }

  public Super3_2(int a) {
    System.out.println("Super3_2(int a)");
  }
}

class Sub3_2 extends Super3_2 {
  public Sub3_2() {
    System.out.println("Sub3_2()");
  }

  public Sub3_2(int a) {
    super(a); // コンストラクタ定義の先頭
    System.out.println("Sub3_2(int a)");
  }
}

class Sample7_7 {
  public static void main(String[] args) {
    Sub3_2 s1 = new Sub3_2();
    Sub3_2 s2 = new Sub3_2(10);

    // new Sub3_2();
    // new Sub3_2(10);
  }
}
