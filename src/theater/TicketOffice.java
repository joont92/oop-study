package theater;

import java.time.LocalDateTime;
import java.util.Stack;
import java.util.stream.IntStream;

public class TicketOffice {
    private Integer moneyAmount;
    private Stack<Ticket> tickets;

    public TicketOffice(int ticketAmount, int ticketFee) {
        if(ticketAmount <= 0) {
            throw new IllegalArgumentException("at least 1 ticket");
        }

        this.moneyAmount = 0;

        LocalDateTime today = LocalDateTime.now();
        this.tickets = new Stack<>();
        IntStream.range(0, ticketAmount)
            .forEach(i -> tickets.push(new Ticket(ticketFee, today)));
    }

    public Ticket change(Invitation invitation) {
        return tickets.pop();
    }

    public Ticket sell(Integer fee) {
        if(tickets.isEmpty()) {
            throw new IllegalStateException("sold out!");
        }

        Ticket ticket = tickets.get(0);
        if(!fee.equals(ticket.getFee())) {
            throw new IllegalArgumentException("money is wrong");
        }
        moneyAmount += ticket.getFee();

        return ticket;
    }

    public Integer getTicketFee() {
        return tickets.get(0).getFee();
    }
}
