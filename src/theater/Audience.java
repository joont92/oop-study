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

    public Audience(Integer money, Invitation invitation) {
        this.money = money;
        this.invitation = Optional.of(invitation);
    }

    public Ticket getTicket(TicketOffice ticketOffice) {
        invitation.ifPresent(i -> {
            ticket = Optional.of(ticketOffice.change(i));
            i.use();
        });

        if(!invitation.isPresent()) {
            Integer fee = ticketOffice.getTicketFee();

            ticket = Optional.of(ticketOffice.sell(fee));
            money -= fee;
        }

        return ticket.get();
    }

    public boolean useTicket() {
        if(ticket.isPresent()) {
            ticket = Optional.empty();
            return true;
        }
        return false;
    }
}
