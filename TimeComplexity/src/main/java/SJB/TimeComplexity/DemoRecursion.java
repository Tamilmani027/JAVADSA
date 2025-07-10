package SJB.TimeComplexity;

public class DemoRecursion {
    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }
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
        System.out.println("Factorial of 5 is: " + fact(5));
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
