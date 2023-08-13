class Sample3_13 {
  public static void main(String[] args) {
    int num = 3;
    switch (num) {
      case 1:
      case 2:
        System.out.println("numの値は1または2です。");
        break;
      case 3:
      case 4:
        System.out.println("numの値は3または4です。");
        break;
      default:
        System.out.println("defaultです。");
    }
  }    
}
