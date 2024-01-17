package extends1.ex;

public class Album extends Item {

    private String artist;

    public Album(final String name, final int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트:" + artist);
    }
}
