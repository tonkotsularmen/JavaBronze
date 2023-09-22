
public class Jihan2 {

  public static void main(String[] args) {

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

    for (int i = 0; i < args.length; i++) { // 投入された硬貨の枚数分の配列に初期値0を代入
      unuseableCoin[i] = 0;
    }

    System.out.println("投入した硬貨の枚数は " + args.length + " 枚です。");

    for (int i = 0; i < args.length; i++) {
      enteredCoins[i] = Integer.parseInt(args[i]); // 投入された硬貨の値を配列enteredCoinsに格納

      // System.out.println(enteredCoins[i]);

      switch (enteredCoins[i]) { // 適切ではない硬貨を警告として表示
        case 1:
          System.out.println(WARNING_MESSAGE_FOR_¥1);
          break;
        case 5:
          System.out.println(WARNING_MESSAGE_FOR_¥5);
          break;
      }

      if ( // 法定硬貨ではないものが投入された場合の警告を表示
      !(enteredCoins[i] == 1 ||
          enteredCoins[i] == 5 ||
          enteredCoins[i] == 10 ||
          enteredCoins[i] == 50 ||
          enteredCoins[i] == 100 ||
          enteredCoins[i] == 500)) {
        // 投入された硬貨の最後尾は購入代金のため、警告文を表示しない
        if (!(enteredCoins[enteredCoins.length - 1] == enteredCoins[i])) {
          System.out.println(WARNING + enteredCoins[i] + UNUSEABLE_COINS_MESSAGE);
        }
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

    // 要件から購入代金はコマンドライン引数の最後尾なので、それを購入代金の変数に代入
    purchasePrice = enteredCoins[enteredCoins.length - 1];

    // 投入金額 - 購入代金 = お釣り
    change = totalAmount - purchasePrice;

    // お釣りとメッセージの表示
    System.out.println(change + THANKS_MESSAGE);
  }

}
