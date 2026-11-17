
package oopconcepts;

class ParkingFee {

    private final double amount;

    ParkingFee(double amount) {

        if (amount < 0) {
            throw new IllegalArgumentException(
                "Fee cannot be negative"
            );
        }

        this.amount = amount;
    }

    void display() {
        System.out.println("Parking Fee: " + amount);
    }
}

public class MainParkingFee {

    public static void main(String[] args) {

        try {

            ParkingFee p1 = new ParkingFee(100);
            p1.display();

            ParkingFee p2 = new ParkingFee(-50);
            p2.display();

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
