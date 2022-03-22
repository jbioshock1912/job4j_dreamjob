package core.error;

import java.io.File;
import java.io.IOException;

public class Testing {

    public static int sqrt(int number) {
        if (number > 100) {
            throw new InvalidParamException("Число больше 100");
        }
        return number * number;
    }

    public static void readFile()  {
        //не можем обработать!!!
        try {
            throw new IOException("WER");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
       /* catch (IOException e) {
            e.printStackTrace();
        }*/


    }

    public static void readFile1() throws IOException {
        //не можем обработать!!!
        throw new IOException("WER");
    }

    public static void main(String[] args) {
        System.out.println(sqrt(99));
        System.out.println(sqrt(101));
    }
}
