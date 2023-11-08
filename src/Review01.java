
public class Review01 {

    public static void main(String[] args) {

        //価格
        int price = 1500;

        double tax_rate = 0.1;

        int tax = taxCalc(price,tax_rate);

        int total = price + tax;

        System.out.println(price + "円の商品の税込価格は" + total + "円（消費税は" + tax + "円）です。");

    }

    //taxメソッド
    public static int taxCalc(int price,double tax_rate) {
        int result = ((int)(price * tax_rate));
        return result;
    }

}
