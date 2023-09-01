class Test2 {
  String myPrint(int a, String b) { // 1
    return "test";
  }

  String myPrint(int a, int b) {
    return "test";
  } // こちらは二つ目の引数が異なるためオーバーロードとみなされます。

  String myPrint(String a, int b) {
    return "test";
  } // こちらは引数の並びが異なるため適切なオーバーロードです。

  // void myPrint(int a, String b){ }
  // 上記のメソッドは、引数、並び、数が同じで、戻り値だけ異なりますが、オーバーロードとはみなされません。コンパイルエラーとなります。

  // String myPrint(int x, String y){ return "test";}
  // 上記のメソッドは、引数の引数名は変えていますが、型、並び、数が同じであるためオーバーロードとみなされません。コンパイルエラーとなります。
}
