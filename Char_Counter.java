import java.util.Scanner;

public class Char_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            } else if (Character.isSpaceChar(c)) {
                spaceCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("The string is: " + inputString);
        System.out.println("letter: " + letterCount);
        System.out.println("space: " + spaceCount);
        System.out.println("number: " + numberCount);
        System.out.println("other: " + otherCount);

    }
}
