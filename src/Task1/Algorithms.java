package Task1;

public class Algorithms {

    public static void main(String args[]) {

        int arr[] = {8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};

        System.out.println("Original array: " + sortArrays(arr));

        arr = sortArrays(arr);

        System.out.println("Sorted array: " + sortArrays(arr));
    }

    public static int[] sortArrays(int[] arr) {
        int length = arr.length;

        for(int i = 0; i < length-1; i++) {
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
        return arr;
    }
}
