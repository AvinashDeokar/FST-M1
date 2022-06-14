package Activites;
import java.util.*;

public class Activity2 {
    public static void main(String[] args) {

        int[] Arr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(Arr));


        int search = 10;
        int fixedSum = 30;


        System.out.println("Result: " + result(Arr, search, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int tempsum = 0;

        for (int number : numbers) {
             if (number == searchNum) {
                 tempsum = tempsum + searchNum;
            }

            if (tempsum > fixedSum) {
                break;
            }
        }

        return tempsum == fixedSum;
    }
}