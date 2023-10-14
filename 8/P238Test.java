class P238Super {

  // SuperクラスにmethodAが定義されていない場合はTestクラスで呼び出す時にコンパイルエラーが起こる
  void methodA() {
    System.out.println("SuperClassのmethodA");
  }

}

class P238Sub extends P238Super {

  // SubクラスのmethodAが定義されていない場合は、SuperクラスのmethodAを呼びに行く
  void methodA() {
    System.out.println("SubClassのmethodA");
  }

  void methodB() {
    System.out.println("SubClassのmethodB");
  }

}

public class P238Test {

  public static void main(String[] args) {

    P238Super s1 = new P238Sub();
    s1.methodA();

    P238Sub s2 = (P238Sub) s1;
    s2.methodB();
  }

}
