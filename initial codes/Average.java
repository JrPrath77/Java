public class Average {
    public static void main(String args[]) {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        int sum_of_even = 0;
        int sum_of_odd = 0;

        for (int i = lowerbound; i <= upperbound; i++) {
            sum += i;
        }

        double average = (double) sum / (upperbound - lowerbound + 1);

        System.out.println("The sum of " + lowerbound + " to " + upperbound + " is " + sum);
        System.out.println("The average is " + average);

        for (int i = lowerbound; i <= upperbound; i++) {
            if (i % 2 == 0) {
                sum_of_even += i;
            } else {
                sum_of_odd += i;
            }
        }

        System.out.println("The sum of even numbers is " + sum_of_even);
        System.out.println("The sum of odd numbers is " + sum_of_odd);

        int absolute_difference = sum_of_even - sum_of_odd;
        System.out.println("The absolute difference between the sum of even and odd numbers is " + absolute_difference);
    }
}
