
package oopconcepts;

class TicketBooking {

    private final String bookingId;
    private final int tickets;

    public TicketBooking(String bookingId, int tickets) {

        if (bookingId == null || bookingId.isBlank()) {
            throw new IllegalArgumentException(
                    "Booking ID cannot be null or blank"
            );
        }

        if (tickets <= 0) {
            throw new IllegalArgumentException(
                    "Tickets should be positive"
            );
        }

        this.bookingId = bookingId;
        this.tickets = tickets;
    }

    public String getBookingId() {
        return bookingId;
    }

    public int getTickets() {
        return tickets;
    }
}

public class IllegalStateDemo {

    public static void main(String[] args) {

        TicketBooking b = new TicketBooking("B101", 25);

        System.out.println("Booking ID: " + b.getBookingId());

        System.out.println("Tickets: " + b.getTickets());
    }
}
