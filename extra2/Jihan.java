public class Jihan {

  public static void main(String[] args) {

    // 投入された硬貨の枚数分の配列を作る
    int[] enteredCoins = new int[args.length]; // 投入された硬貨の枚数分の配列を作る
    int totalAmount = 0; // 投入金額の合計
    int[] unuseableCoin = new int[args.length]; // 硬貨として適切ではない値を格納する配列
    int change = 0; // お釣り
    int purchasePrice = 0; // 購入金額を0で初期化

    final String WARNING_MESSAGE_FOR_¥1 = "警告 : 1円玉は使えません";

    final String WARNING_MESSAGE_FOR_¥5 = "警告 : 5円玉は使えません";

    final String WARNING = "警告 : ";

    final String UNUSEABLE_COINS_MESSAGE = "は硬貨として適切な値ではありません";

    final String THANKS_MESSAGE = "円のお釣りです。ありがとうございました。";

    System.out.println("投入した硬貨の枚数は " + args.length + " 枚です。");

    for (int i = 0; i < args.length; i++) {
      enteredCoins[i] = Integer.parseInt(args[i]);

      // System.out.println(enteredCoins[i]);

      switch (enteredCoins[i]) {
        case 1:
          System.out.println(WARNING_MESSAGE_FOR_¥1);
          break;
        case 5:
          System.out.println(WARNING_MESSAGE_FOR_¥5);
          break;
      }

      if (!(enteredCoins[i] == 1 ||
          enteredCoins[i] == 5 ||
          enteredCoins[i] == 10 ||
          enteredCoins[i] == 50 ||
          enteredCoins[i] == 100 ||
          enteredCoins[i] == 500)) {
        System.out.println(WARNING + enteredCoins[i] + UNUSEABLE_COINS_MESSAGE);
      }

      if (enteredCoins[i] == 1 || enteredCoins[i] == 5) { // 1円玉と5円玉をunuseableCoins配列に格納

        unuseableCoin[i] = enteredCoins[i];

      } else if ( // 法定硬貨ではないものをunuseableCoins配列に格納
      !(enteredCoins[i] == 1 ||
          enteredCoins[i] == 5 ||
          enteredCoins[i] == 10 ||
          enteredCoins[i] == 50 ||
          enteredCoins[i] == 100 ||
          enteredCoins[i] == 500)) {
        unuseableCoin[i] = enteredCoins[i];
      }

      if ( // 10円玉、50円玉、100円玉、500円玉なら合計金額に加算
      enteredCoins[i] == 10 ||
          enteredCoins[i] == 50 ||
          enteredCoins[i] == 100 ||
          enteredCoins[i] == 500) {
        totalAmount += enteredCoins[i];
      }
    }

    System.out.println("ただいまの投入金額は" + totalAmount + "円です");
  }

}
