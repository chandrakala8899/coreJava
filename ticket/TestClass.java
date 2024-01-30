package ticket;

public class TestClass {
    public static void main(String[] args) {
        TicketBookService ts=new TicketBookService();
       Ticket ticket= ts.bookTicket(5,"a","salar","10:30","2");
        System.out.println(ticket);
    }
}

