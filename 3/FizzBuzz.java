class FizzBuzz {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    if (a % 15 == 0) {
      System.out.println("15の倍数です。");
    } else if (a % 5 == 0) {
      System.out.println("5の倍数です。");
    } else if (a % 3 == 0) {
      System.out.println("3の倍数です。");
    } else {
      System.out.println("それ以外です。");
    }
    
  }  
}
