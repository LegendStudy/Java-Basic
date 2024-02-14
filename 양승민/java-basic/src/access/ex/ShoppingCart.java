package access.ex;

public class ShoppingCart {
    private final Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item1) {
        items[itemCount++] = item1;
    }


    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            int price = items[i].totalPrice();
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + price);
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.totalPrice();
        }
        return totalPrice;
    }
}
