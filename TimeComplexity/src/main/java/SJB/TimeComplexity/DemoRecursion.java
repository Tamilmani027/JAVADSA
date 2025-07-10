package SJB.TimeComplexity;

public class DemoRecursion {

    // Method to calculate factorial using recursion
    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }

    // Method to calculate nth Fibonacci number using recursion
    public static int fibo(int a) {
        if (a == 0)
            return 0;
        else if (a == 1)
            return 1;
        else
            return fibo(a - 1) + fibo(a - 2);
    }

    public static void main(String[] args) {
        int n = 10;

        // Display factorial of 5
        System.out.println("Factorial of 5 is: " + fact(5));

        // Display Fibonacci series up to n terms
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
