
package oopconcepts;

import java.util.ArrayList;
import java.util.List;

class SeatBooking {

    private final List<String> seats;

    public SeatBooking(List<String> seats) {
        this.seats = new ArrayList<>(seats);
    }

    public List<String> getSeats() {
        return new ArrayList<>(seats);
    }
}

public class DefensiveCopyingDemo {

    public static void main(String[] args) {

        List<String> seats = new ArrayList<>();

        seats.add("A1");

        SeatBooking b = new SeatBooking(seats);

        System.out.println("Original seats: " + b.getSeats());

        seats.add("A2");

        System.out.println("After modifying original list: "
                + b.getSeats());

        List<String> returnedSeats = b.getSeats();

        returnedSeats.add("A3");

        System.out.println("After modifying returned list: "
                + b.getSeats());
    }
}
