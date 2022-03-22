package epam.topic_one;

class Fibonacci {

    static long getFibonacciNumber(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
    }
}
