package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(final String name, final int price, final int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
