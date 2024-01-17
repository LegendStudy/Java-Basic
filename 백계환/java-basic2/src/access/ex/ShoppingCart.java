package access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private int itemCount;
    private final int capacity = 10;

    public ShoppingCart() {
        items = new ArrayList<>(capacity);
    }

    public void addItem(Item item) {
        // 검증로직
        if (itemCount >= capacity) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        // 실행로직
        itemCount++;
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
