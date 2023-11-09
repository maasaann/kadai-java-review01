
public class Review01 {

    public static void main(String[] args) {

        int price = 1500; //価格

        double tax_rate = 0.1; //税率

        int tax = tax(price,tax_rate); //税額計算

        int total = price + tax;

        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + tax + "円）です。");

    }

    //taxメソッド
    public static int tax(int price,double tax_rate) {
        int result = ((int)(price * tax_rate));
        return result;
    }

}
