package tetingTask;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        int[] arraySort = sortByBubble();
        for (int i = 0; i < arraySort.length; i++){
            System.out.println(arraySort[i]);
        }
    }


    public static int[] sortByBubble() {
        int[] number = { 1, -20, -7, 2, 8, 23, 21, 54, 4, -50 };
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 1; j < number.length - i; j++) {
                if (number[j] < number[j - 1]) {
                    int temp = number[j - 1];
                    number[j - 1] = number[j];
                    number[j] = temp;
                }
            }
        }
        return number;
    }
}
