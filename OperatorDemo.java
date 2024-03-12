public class OperatorDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Assignment Operators
        int c = 15;
        System.out.println("\nAssignment Operators:");
        System.out.println("Simple Assignment: " + c);
        c += 5;
        System.out.println("Compound Assignment (c += 5): " + c);

        // Comparison Operators
        int x = 10, y = 20;
        System.out.println("\nComparison Operators:");
        System.out.println("Equal to: " + (x == y));
        System.out.println("Not equal to: " + (x != y));
        System.out.println("Greater than: " + (x > y));
        System.out.println("Less than: " + (x < y));
        System.out.println("Greater than or equal to: " + (x >= y));
        System.out.println("Less than or equal to: " + (x <= y));

        // Logical Operators
        boolean p = true, q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("AND: " + (p && q));
        System.out.println("OR: " + (p || q));
        System.out.println("NOT: " + !p);

        // Increment and Decrement Operators
        int num = 5;
        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("Original Value: " + num);
        System.out.println("Postfix Increment: " + (num++));
        System.out.println("Prefix Increment: " + (++num));
        System.out.println("Postfix Decrement: " + (num--));
        System.out.println("Prefix Decrement: " + (--num));

        // Bitwise Operators
        int m = 5, n = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("AND: " + (m & n));
        System.out.println("OR: " + (m | n));
        System.out.println("XOR: " + (m ^ n));
        System.out.println("Shift Left: " + (m << 1));
        System.out.println("Shift Right: " + (m >> 1));
    }
}
