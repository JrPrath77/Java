/* 10.	Write a program that illustrates interface inheritance. Interface P12 inherits from both P1 and P2. Each interface declares one constant and one method.
 The class Q implements P12 . Instantiate Q and invoke each of its methods. Each method displays one of the constants. */
// Interface P1
interface P1 {
    int CONSTANT_1 = 10; // Constant
    void methodP1(); // Method
}

// Interface P2
interface P2 {
    int CONSTANT_2 = 20; // Constant
    void methodP2(); // Method
}

// Interface P12 inherits from P1 and P2
interface P12 extends P1, P2 {
}

// Class Q implements P12 interface
class Q implements P12 {
    // Implementing methodP1 from interface P1
    public void methodP1() {
        System.out.println("Constant from P1: " + CONSTANT_1);
    }

    // Implementing methodP2 from interface P2
    public void methodP2() {
        System.out.println("Constant from P2: " + CONSTANT_2);
    }
}

public class exp3_10  {
    public static void main(String[] args) {
        // Instantiate Q
        Q q = new Q();

        // Invoke methods of Q
        q.methodP1();
        q.methodP2();
    }
}


