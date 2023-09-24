public class CalcCakeSum {
  public static void main(String[] args) {

    int price; // 商品一個の価格
    int amount = 0; // 商品の個数
    String cake; // 商品名を代入するcake変数
    int subtotal; // 小計
    double total = 0.0; // 合計金額
    int discount = 2; // 割引率
    double tax = 8.0;
    int orderCount = args.length; // コマンドラインで受け取る配列の数
    int totalAmount;
    String NotFoundCake = null;

    // args配列[0]と[偶数]が商品名なので、cakeに商品名を代入
    for (int i = 0; i < orderCount; i = i + 2) {
      subtotal = 0;
      cake = args[i];

      switch (cake) {
        case "ショートケーキ":
          price = 320;
          break;
        case "モンブラン":
          price = 350;
          break;
        case "チョコレートケーキ":
          price = 370;
          break;
        case "いちごのタルト":
          price = 400;
          break;
        case "チーズケーキ":
          price = 300;
          break;
        default:
          NotFoundCake = cake;
          price = 0;
          break;
      }

      // args配列[奇数]が商品の個数なのでi + 1の値をjに代入する
      int j = i + 1;
      amount = Integer.parseInt(args[j]);

      subtotal = price * amount; // 小計 = 価格 + 商品の個数
      System.out.println(subtotal);
      total = total + subtotal; // 商品の合計金額
    }

    // 商品の合計金額が1000円以上なら、2割引
    if (total >= 1000) {
      total = total * (1 - (double) discount / 10);
    }
    totalAmount = (int) (total * (1 + (tax / 100)));

    if (NotFoundCake != null) {
      System.out.println(NotFoundCake + "という商品はございません。");
    }

    System.out.println("合計金額は : " + totalAmount + "円です。");
  }
}
