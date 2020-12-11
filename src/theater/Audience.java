package theater;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public long buy(Ticket ticket) {
        bag.setTicket(ticket);

        if(bag.hasInvitation()) {
            return 0L;
        }  else {
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
