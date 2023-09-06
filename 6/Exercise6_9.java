class Foo {
  void Foo() {
    System.out.println("Hello");
  }

  void Foo(String str) {
    System.out.println("Bye");
  }
  // どちらも戻り値が指定されているため、コンストラクタではなくメソッドとして扱われます。
  // Fooクラスをコンパイルすると、デフォルトコンストラクタが追加されます。
}

class Exercise6_9 {
  public static void main(String[] args) {
    Foo f = new Foo();
  }
  // Fooクラスをインスタンス化しています。
  // このとき、Fooクラスのコンストラクタを呼び出していますが、
  // これは2行目ではなく、デフォルトコンストラクタを呼び出しています。
}
