class Sample3_6 {
  public static void main(String[] args) {
    String str1 = null;
    String str2 = "";
    int[] array1 = null;
    int[] array2 = new int[1];
    int num = 0;

    // System.out.println(array1[0]);
    // Exception in thread "main" java.lang.NullPointerException: 
    // Cannot load from int array because "<local3>" is null
    System.out.println(array1);
    System.out.println(str1 == null);
    System.out.println(str2 == null);
    System.out.println(array1 != null);
    System.out.println(array2 != null);
    // System.out.println(num == null); コンパイルエラー
    System.out.println(num);
  }  
}
