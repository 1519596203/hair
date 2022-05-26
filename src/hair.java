import java.util.Scanner;

public class hair {
    int permprice,washingprice,haircutprice;
    String perm;

    public hair(int permprice, int washingprice, int haircutprice) {
        this.permprice = permprice;
        this.washingprice = washingprice;
        this.haircutprice = haircutprice;
    }
    public boolean SelectHair(customer custo) {

        Scanner READER = new Scanner(System.in);
        while (true) {
            switch (custo.select) {
                case "perm":
                    if (custo.money >= 30) {
                        custo.money -= 30;
                        System.out.println("支付成功！");
                        return true;
                    } else System.out.println("余额不足！这边建议您换个发型");
                case "haircut":
                    if (custo.money >= 20) {
                        custo.money -= 20;
                        System.out.println("支付成功！");
                        return true;
                    } else System.out.println("余额不足！这边建议您换个发型");
                case "washing":
                    if (custo.money >= 10) {
                        custo.money -= 10;
                        System.out.println("支付成功！");
                        return true;
                    } else System.out.println("年轻人，没钱就回家去吧！");
                    return false;
                default:
                    System.out.print("无此发型，请重新选择");
                    System.out.print("（perm烫发30元，haircut剪发20元，washing洗头发10元）:");
            }
            custo.select = READER.nextLine();
        }
    }
}
