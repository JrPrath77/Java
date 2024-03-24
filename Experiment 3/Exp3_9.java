import java.util.Scanner;

class Student {
    int marks[];
    String name;
}

class Markname extends Student {
    public void take_input() {
        Scanner scanner = new Scanner(System.in);
        marks = new int[2]; // Assuming 2 subjects
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            name = scanner.nextLine();
            for (int j = 0; j < marks.length; j++) {
                System.out.print("Enter marks of subject " + (j + 1) + " for student " + (i + 1) + ": ");
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline character
            displayMarks(); // Display marks after input for each student
        }
    }

    public void displayMarks() {
        // Displaying names and marks of the current student
        System.out.println("\nName\tSubject 1\tSubject 2");
        System.out.print(name + "\t");
        for (int mark : marks) {
            System.out.print(mark + "\t\t");
        }
        System.out.println();
    }
}

public class Exp3_9 {
    public static void main(String args[]) {
        Markname markname = new Markname();
        markname.take_input(); // Take input for names and marks
    }
}
