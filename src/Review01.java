
public class Review01 {

    public static void main(String[] args) {

        int price = 1500; //価格

        double tax_rate = 0.1; //税率

        int tax_price = tax(price,tax_rate); //税額計算

        int total = price + tax_price; //総額

        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + tax_price + "円）です。");

    }

    //taxメソッj
    public static int tax(int price,double tax_rate) {
        int result = ((int)(price * tax_rate));
        return result;
    }

}
