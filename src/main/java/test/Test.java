package test;

import java.util.Scanner;

public class Test {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        String params = console.nextLine();
        var paramArray = params.split(" ");
        int sumSilvery = Integer.parseInt(paramArray[0]);
        int example = Integer.parseInt(paramArray[1]);
        int coin = Integer.parseInt(paramArray[2]);

        int count = 0;
        while (sumSilvery >= example) {
            sumSilvery = sumSilvery - example;
            count = count + example / coin;
            sumSilvery = sumSilvery + example % coin;
        }
        System.out.println(count);
    }
}

