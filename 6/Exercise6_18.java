class Exercise6_18 {
  static String lang = "C";
  public String operation = "Unix";

  Exercise6_18() {
  }

  Exercise6_18(String str) {
    operation = str;
  }

  public static void main(String args[]) {
    Exercise6_18 obj5_1 = new Exercise6_18();
    Exercise6_18 obj5_2 = new Exercise6_18("Solaris");
    obj5_2.lang = "Java";
    System.out.println(obj5_1.lang + "\t" + obj5_1.operation);
    System.out.println(obj5_2.lang + "\t" + obj5_2.operation);
  }
}
