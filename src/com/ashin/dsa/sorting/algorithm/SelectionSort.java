package com.ashin.dsa.sorting.algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        int arrSize = array.length;

        // Loop through each element of the array
        for (int i = 0; i < arrSize - 1; i++) {
            // Assume the first element is the minimum
            int minIndex = i;

            // Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < arrSize; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }


    public static void main(String []args){
        System.out.println("selection sort");
        int []data={4,7,8,7,3,2,6};
        selectionSort(data);
        System.out.println(Arrays.toString(data));

    }

}
