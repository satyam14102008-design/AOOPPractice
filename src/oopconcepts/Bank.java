
package oopconcepts;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<String> holders = new ArrayList<>();

    public void addHolder(String name) {
        holders.add(name);
    }

    public List<String> getHolders() {
        return new ArrayList<>(holders);
    }

    public static void main(String[] args) {

        Bank myBank = new Bank();

        myBank.addHolder("Satyam");

        List<String> linkedList = myBank.getHolders();

        linkedList.add("Hacker");

        System.out.println(myBank.getHolders());
    }
}
