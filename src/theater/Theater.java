package theater;

public class Theater {
    private TicketOffice ticketOffice;

    public Theater(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void enter(Audience audience) {
        audience.getTicket(ticketOffice);
        audience.useTicket();
    }
}
