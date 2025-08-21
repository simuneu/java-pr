package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder tofu = new ProductOrder();
        tofu.productName="두부";
        tofu.price=1000;
        tofu.quantity=1;

        ProductOrder ice = new ProductOrder();
        ice.productName="얼음";
        ice.price=2000;
        ice.quantity=2;

        int totalPrice = 0;
        ProductOrder[] pArr = new ProductOrder[]{tofu, ice};
        for (ProductOrder po : pArr) {
            System.out.println("상품명 : "+po.productName+", 가격 : "+po.price+", 수량 : "+po.quantity);
            totalPrice += po.price * po.quantity;
        }
        System.out.println("총 금액 : "+totalPrice);

    }
}
