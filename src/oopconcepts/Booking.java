
package oopconcepts;

public class Booking {

    private String cName;
    private String cId;
    private int amount;

    public Booking(String cName, String cId, int amount) {

        if (cName == null || cName.isBlank()) {
            throw new IllegalArgumentException(
                "Name can't be null or blank."
            );
        }

        if (cId == null || cId.isBlank()) {
            throw new IllegalArgumentException(
                "Id can't be null or blank."
            );
        }

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Amount can't be 0 or negative."
            );
        }

        this.cName = cName;
        this.cId = cId;
        this.amount = amount;
    }

    public String getCName() {
        return cName;
    }

    public String getCId() {
        return cId;
    }

    public int getAmount() {
        return amount;
    }

    public static void main(String[] args) {

        Booking b = new Booking("Satyam", "32600", 500);

        System.out.println(b.getCName());
    }
}
