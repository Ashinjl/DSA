package com.ashin.dsa.array.problems;

public class ReversanArrayWhileloop {

    public static void reverseArray(int[] number,int start,int end) {
        while(start<end) {
            int temp=number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;

        }
    }

    public static void printArray(int [] myArray,int value) {
        System.out.println("The array elements are:");
        for (int i = 0; i < value; i++) {
            System.out.println(myArray[i]);
        }
    }
    public static void main(String[] args) {
        int[] number= {1,2,3,4,5};

        reverseArray(number,0,number.length-1);
        printArray(number,number.length-1);


    }

}