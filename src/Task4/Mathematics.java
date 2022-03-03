package Task4;

import java.util.Random;
import java.util.Arrays;

public class Mathematics {


    public static void main(String args[]) {

        allDivisible(7);

        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10};
        int b = arr.length;
        random(arr, b);

        recursion(5);

        fibonacci(1, 1);
    }

    public static void allDivisible(int tmpMyInt) {
        int myInt = tmpMyInt;
        for (int i=1; i<100; i++) {
            if (i%myInt==0) System.out.println((i) +", ");
        }
    }

    public static void random(int myArray[], int a)
    {
        // Creating Random object
        Random rd = new Random();

        // Randomizing 1 by 1 from the last element
        for (int i = a-1; i > 0; i--) {

            // Picking random index from 0 to i
            int j = rd.nextInt(i+1);

            int temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;
        }
        System.out.println(Arrays.toString(myArray));
    }

    public static void recursion(int tmpMyInt) {
        int myInt = tmpMyInt;
        for (int i = myInt; i >= 0; i--) {
            System.out.println(i + " ");
        }
    }

    public static void fibonacci(int tmpA, int tmpB) {
        int n = 10000;
        int a = tmpA;
        int b = tmpB;

        while (a <= n){
            System.out.print(a + ", ");

            int nextInt = a + b;
            a = b;
            b = nextInt;
        }
    }
}
