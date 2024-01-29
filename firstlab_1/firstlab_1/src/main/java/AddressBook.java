import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
    }

    public void displayAddressBook() {
        for (BuddyInfo buddy : buddies) {
            System.out.println("Name: " + buddy.getName() + ", Phone: " + buddy.getPhoneNumber());
        }
    }

    public static void main(String[] args) {
        // Create an AddressBook object
        AddressBook addressBook = new AddressBook();

        // Populate it with BuddyInfo instances
        BuddyInfo buddy1 = new BuddyInfo("John", "123-456-7890");
        BuddyInfo buddy2 = new BuddyInfo("Jane", "987-654-3210");

        // Add buddies to the address book
        addressBook.addBuddy(buddy1);
        addressBook.addBuddy(buddy2);

        // Print the content of the address book
        addressBook.displayAddressBook();
    }
}