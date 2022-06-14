package Activites;


import java.util.*;
public class Activity4 {

    static void ascendingSort(int aray1[]) {
        int size = aray1.length;

        for (int i = 1; i < size; i++) {
            int key = aray1[i];
            int j = i - 1;

            while (j >= 0 && key < aray1[j]) {
                aray1[j + 1] = aray1[j];
                --j;
            }
            aray1[j + 1] = key;
        }
    }

    static void descendingSort(int aray1[]) {
        int size = aray1.length;

        for (int i = 1; i < size; i++) {
            int key = aray1[i];
            int j = i - 1;

            while (j >= 0 && key > aray1[j]) {
                aray1[j + 1] = aray1[j];
                --j;
            }
            aray1[j + 1] = key;
        }
    }
    public static void main(String[] args)
    {
        int[] aray ={22,45,11,8,0,100,34,5,};
        ascendingSort(aray);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(aray));

        descendingSort(aray);
        System.out.println("Sorted Array in Descending Order: ");
        System.out.println(Arrays.toString(aray));
    }
}
