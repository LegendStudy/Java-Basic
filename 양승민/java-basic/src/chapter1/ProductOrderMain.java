package chapter1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = {
                new ProductOrder("두부", 2000, 2),
                new ProductOrder("김치", 5000, 1),
                new ProductOrder("콜라", 1500, 2),
        };

        int total = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            total += order.price * order.quantity;
        }

        System.out.println("총 결제 금액: " + total);
    }
}
