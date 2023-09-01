class Employee3 {
  int id;
  String name;

  Employee3() {
    System.out.println("Employee()");
  }

  Employee3(String name) {
    System.out.println("Employee(String name)");
  }

  Employee3(int id) {
    System.out.println("Employee(int id)");
  }

  Employee3(int id, String name) {
    System.out.println("Employee(int id, String name)");
  }
}

class Sample6_5 {
  public static void main(String[] args) {
    Employee3 a = new Employee3();
    Employee3 b = new Employee3("yamamoto");
    Employee3 c = new Employee3(100);
    Employee3 d = new Employee3(100, "yamamoto");
  }
}
