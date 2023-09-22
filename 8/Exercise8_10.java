class Foo {
  String name;

  void show() {
    System.out.println(name);
  }
}

class Exercise8_10 extends Foo {
  Exercise8_10(String name) {
    this.name = name;
  }

  void show() {
    System.out.println(name);
  }

  public static void main(String[] args) {
    Foo obj = new Exercise8_10("hana");
    obj.show();
    // ((Exercise8_10) obj).show();
  }
}
