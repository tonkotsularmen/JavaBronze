class Super {
  int num;

  public void methodA() {
    num += 100;
  }

  public void print() {
    System.out.println("numの値 : " + num);
  }
}

class Sub extends Super {
  public void methodA() {
    num += 500;
  }

  public void methodB() {
    methodA(); // 14行目が呼び出される
    print(); // スーパークラスのメソッドの呼び出し
    super.methodA(); // 4行目が呼び出される
    print(); // スーパークラスが呼び出し
  }
}

class Sample7_5 {
  public static void main(String[] args) {
    Sub s = new Sub();
    s.methodB();
  }
}
