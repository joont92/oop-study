package theater;

import java.util.Optional;

public class Audience {
    private Integer money;
    private Optional<Invitation> invitation;
    private Optional<Ticket> ticket;

    public Audience(Integer money) {
        this.money = money;
        this.invitation = Optional.empty();
    }

    public Audience(Invitation invitation) {
        this.money = 0;
        this.invitation = Optional.of(invitation);
    }

    public void takeTicket(TicketOffice ticketOffice) {
        if(invitation.isPresent()) {
            ticket = Optional.of(ticketOffice.change(invitation.get()));
            invitation = Optional.empty();

            return;
        }

        Integer fee = ticketOffice.getTicketFee();

        ticket = Optional.of(ticketOffice.sell(fee));
        money -= fee;
    }

    public Ticket getTicket() {
        ticket.orElseThrow(IllegalStateException::new);

        return ticket.get();
    }
}
