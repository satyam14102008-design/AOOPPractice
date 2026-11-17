
package oopconcepts;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        // LIST
        List<String> seats = new ArrayList<>();

        seats.add("A1");
        seats.add("A2");
        seats.add("A1");

        System.out.println("List: " + seats);


        // SET
        Set<String> uniqueSeats = new HashSet<>();

        uniqueSeats.add("A1");
        uniqueSeats.add("A2");
        uniqueSeats.add("A1");

        System.out.println("Set: " + uniqueSeats);


        // MAP
        Map<String, Integer> bookings = new HashMap<>();

        bookings.put("B101", 25);
        bookings.put("B102", 30);

        System.out.println("Map: " + bookings);

        System.out.println("Booking B101: "
                + bookings.get("B101"));
    }
}
