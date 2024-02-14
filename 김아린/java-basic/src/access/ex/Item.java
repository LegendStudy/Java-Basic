package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String product, int money, int quantity) {
        this.name = product;
        this.price = money;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
