import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phone {
    Map<String, String> contacts = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.println("Name contact");
        String name = scanner.nextLine();
        System.out.println("Number contact");
        String number = scanner.nextLine();

        contacts.put(name, number);
        System.out.println(contacts);
    }

    public void deleteContact() {
        System.out.println("Name contact");
        String nameDelete = scanner.nextLine();
        if (nameDelete != null) {
            contacts.remove(nameDelete);
        } else {
            System.out.println("Contact not found");
        }
    }

    public Map<String, String> getAllContact() {
        return contacts;
    }

    public void searchContact() {
        System.out.println("Write name: ");
        String searchName = scanner.nextLine();
        if (contacts.containsKey(searchName)) {
            System.out.println("Name: " + searchName + " contact found: " + contacts.get(searchName));
        } else {
            System.out.println("Not found");
        }
    }
}
