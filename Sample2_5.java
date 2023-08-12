class Sample2_5 {
  public static void main(String[] args) {
    char[] c;
    c = new char[3];
    int[] i = new int[3];
    String [] str = {"Welcome", "to", "Java"};
    c[0] = 'A'; c[1] = 'B'; c[2] = 'C';
    i[0] = 100; i[1] = 200; c[2] = 300;
    System.out.println("str[]のサイズ: " + str.length);
    System.out.println("c[0]         :" + c[0]);
    System.out.println("i[1]         :" + i[1]);
    System.out.println(c); // なぜかABIと出力される。Iの上になんかついてる。
    System.out.println(i);
    System.out.println(str);
  }  
}
