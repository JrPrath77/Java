//CollectionExample
import java.util.ArrayList;
import java.util.Iterator;

public class Exp11_1 {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

        // Displaying the elements of the ArrayList using iterator
        System.out.println("Elements of the ArrayList:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Adding an element at a specific index
        list.add(2, "Grapes");

        // Displaying the modified ArrayList
        System.out.println("\nModified ArrayList after adding 'Grapes' at index 2:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Removing an element
        list.remove("Banana");

        // Displaying the ArrayList after removing an element
        System.out.println("\nArrayList after removing 'Banana':");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Checking if an element exists in the ArrayList
        if (list.contains("Orange")) {
            System.out.println("\n'Orange' exists in the ArrayList.");
        } else {
            System.out.println("\n'Orange' does not exist in the ArrayList.");
        }

        // Getting the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + list.size());

        // Clearing the ArrayList
        list.clear();

        // Displaying the ArrayList after clearing it
        System.out.println("\nArrayList after clearing:");
        if (list.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }
}
