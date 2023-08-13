class Sample3_10 {
  public static void main(String[] args) {
    int num = 20;
    String str = "numの値は";
    str += num < 10 ? "10未満" : "10以上";
    // numが10以上の時、str = str + "10以上"
    // numが10未満の時、str = str + "10未満"
    System.out.println(str);
  }  
}
