package theater;

public class Main {
    public static void main(String[] args) {
        Audience audience1 = new Audience(10000);
        Audience audience2 = new Audience(new Invitation());

        Theater theater = new Theater();
        TicketOffice ticketOffice = new TicketOffice(100, 1000);
        audience1.takeTicket(ticketOffice);
        audience2.takeTicket(ticketOffice);

        theater.enter(audience1.getTicket());
        theater.enter(audience2.getTicket());
    }
}
