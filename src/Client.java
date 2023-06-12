public class Client {
    public static void main(String[] args) {
        AuctionMediator mediator = new AuctionMediator();

        Buyer b1 = new AuctionBuyer(mediator, "Jason");
        Buyer b2 = new AuctionBuyer(mediator, "Ian");
        Buyer b3 = new AuctionBuyer(mediator, "Myra");

        // create and add buyers
        mediator.addBuyer(b1);
        mediator.addBuyer(b2);
        mediator.addBuyer(b3);

        System.out.println("Welcome to the auction. Tonight we are selling a vacation to Vegas");
        System.out.println("-------------------------------------------------");

        System.out.println("Waiting for the buyer's offers...");

        // makind bids
        b1.bid(1800);
        b1.bid(2000);
        b1.bid(780);

        System.out.println("-------------------------------------------------");
        mediator.findHighestBidder();

        b2.cancelTheBid();
        System.out.println(b2.getName() + " has canceld his bid! In that case" );

        mediator.findHighestBidder();
    }
}
