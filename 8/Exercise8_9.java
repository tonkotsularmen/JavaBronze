interface I {
  void func();
}

class A implements I {
  public void func() {
    System.out.println("A");
  }
}

class B extends A {
  // 下のコメント外すとBが表示される
  // public void func() {
  // System.out.println("B");
  // }
}

public class Exercise8_9 {
  public static void main(String[] args) {
    I obj = new B();
    obj.func();
  }
}
