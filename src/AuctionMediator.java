import java.util.ArrayList;

public class AuctionMediator implements Mediator {
    // this class implements the mediator interface and holds all the buyers in
    // an arraylist. We can add buyers and find the highest bidder
    private ArrayList<Buyer> buyers;

    public AuctionMediator() {
        this.buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        this.buyers.add(buyer);
        System.out.println(buyer.getName() + " was added to the buyers list.");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;

        for (Buyer b: buyers) {
            if(b.getPrice() > maxBid) {
                maxBid = b.getPrice();
                winner = b;
            }
            b.auctionHasEnded();
        }

        System.out.println("The auction winner is " + winner.getName() +". He paid " + winner.getPrice() + "$ for the item.");
    }
}
