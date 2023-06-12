public abstract class Buyer {
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);
    public abstract void cancelTheBid();
    public abstract void auctionHasEnded();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
