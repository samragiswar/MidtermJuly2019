package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int number = 7;
        int fact = 1;
        int i;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
            System.out.println("i; "+ i);
            System.out.println("fact" + fact);
        }
        System.out.println("The Factorial of Number 7 is :" + fact(7));
        System.out.println("The Factorial of Number 7 is :" + fact);
    }

    static int fact(int n) {

        int x;
        if (n == 1) {
            return 1;
        } else {
            x = n * fact(n - 1);
            return x;

        }

    }
}
