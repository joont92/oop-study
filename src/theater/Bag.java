package theater;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public long hold(Ticket ticket) {
        setTicket(ticket);
        if(hasInvitation()) {
            return 0L;
        } else {
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
