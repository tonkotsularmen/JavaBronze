class Employee4 {
  private int id; // インスタンス変数にprivateを指定

  public Employee4(int i) {
    id = i;
  } // コンストラクタにpublicを指定

  public int getId() {
    return id;
  } // メソッドにpublicを指定
}

public class Sample6_8 {
  public static void main(String[] args) {
    Employee4 emp1 = new Employee4(100);
    // private指定されたメンバは他のクラスからアクセス不可
    // System.out.println("private指定のインスタンス変数へアクセス : " + emp1.id);
    // public指定されたメンバは、他クラスからアクセス可
    System.out.println("public指定のメソッドへアクセス : " + emp1.getId());
  }

}
