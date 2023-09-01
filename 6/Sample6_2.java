class Employee2 {
  int id;

  void setId(int i) {
    id = i;
  }

  int getId() {
    return id;
  }

}

class Sample6_2 {
  public static void main(String[] args) {
    // Aさん用のオブジェクトを作成
    Employee2 a = new Employee2();
    // IDをセットする
    a.setId(100);

    // Bさん用のオブジェクトを作成
    Employee2 b = new Employee2();
    // IDをセットする
    b.setId(200);

    // それぞれのIDを表示
    System.out.println("AさんのIDは" + a.getId());
    System.out.println("BさんのIDは" + b.getId());
  }
}
