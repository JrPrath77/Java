// LinkedListExample
import java.util.LinkedList;
import java.util.Iterator;

public class Exp11_2 {
    public static void main(String[] args) {
        // Create a LinkedList to store integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        // Displaying the elements of the LinkedList using iterator
        System.out.println("Elements of the LinkedList:");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Adding an element at the beginning of the LinkedList
        linkedList.addFirst(5);

        // Adding an element at the end of the LinkedList
        linkedList.addLast(50);

        // Displaying the modified LinkedList
        System.out.println("\nModified LinkedList after adding elements at the beginning and end:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        // Removing an element from the LinkedList
        linkedList.remove(2);

        // Displaying the LinkedList after removing an element
        System.out.println("\nLinkedList after removing element at index 2:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        // Checking if an element exists in the LinkedList
        if (linkedList.contains(30)) {
            System.out.println("\n'30' exists in the LinkedList.");
        } else {
            System.out.println("\n'30' does not exist in the LinkedList.");
        }

        // Getting the size of the LinkedList
        System.out.println("\nSize of the LinkedList: " + linkedList.size());

        // Clearing the LinkedList
        linkedList.clear();

        // Displaying the LinkedList after clearing it
        System.out.println("\nLinkedList after clearing:");
        if (linkedList.isEmpty()) {
            System.out.println("LinkedList is empty.");
        } else {
            System.out.println("LinkedList is not empty.");
        }
    }
}
