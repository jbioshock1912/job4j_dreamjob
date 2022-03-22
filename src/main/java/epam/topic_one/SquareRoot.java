package epam.topic_one;

class SquareRoot {

    static int getSquareRoot(int number) {
        if (number == 1) {
            return 1;
        }

        int halfNumber = number / 2;
        while (halfNumber * halfNumber > number) {
            halfNumber = halfNumber - 1;
        }
        return halfNumber;
    }
}
