package com.ashin.dsa.array.problems;

import java.util.Arrays;

public class ReversanArray {
    int[] myarray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] newArray = new int[myarray.length];

    void reversArray() {
        int j = 0;
        for (int i = myarray.length - 1; i >= 0; i--) {
            newArray[j] = myarray[i];
            j++;
        }
        System.out.println("Original Array: " + Arrays.toString(myarray));
        System.out.println("Reversed Array: " + Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        ReversanArray reversArray = new ReversanArray();
        reversArray.reversArray();
    }
}
