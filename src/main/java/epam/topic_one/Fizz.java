package epam.topic_one;

public class Fizz {

    public static void main(String[] args) {
        checkNumber(25);
        System.out.println();
        checkNumber(15);
        System.out.println();
        checkNumber(12);
        checkNumber(2);
    }

    private static void checkNumber(int number) {
        if (number % 3 == 0) {
            System.out.print("fizz");
        }
        if (number % 5 == 0) {
            System.out.print("buzz");
        }
    }
}