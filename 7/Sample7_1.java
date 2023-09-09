class Employee {
  private String id = "100";

  public String getId() {
    return id;
  }
}

// サブクラスの定義
class Sales extends Employee {
  private String clientName = "SE";

  public String getClientName() {
    return clientName;
  }
}

class Sample7_1 {
  public static void main(String[] args) {
    Sales s = new Sales(); // サブクラスをインスタンス化
    // サブクラスで定義したメソッドの呼び出し
    System.out.println("clientName : " + s.getClientName());
    // スーパークラスで定義したメソッドの呼び出し
    System.out.println("id         : " + s.getId());
  }
}
