package com.ashin.dsa.array.problems;

import java.util.Scanner;

public class PrintOddNumber {

    void printOddArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size:");
        int value = scan.nextInt();
        int[] myArray = new int[value];

        // Getting array values from the user
        for (int i = 0; i < value; i++) {
            System.out.print("Enter the value of myArray[" + i + "]: ");
            myArray[i] = scan.nextInt();
        }

        int oddcount = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                oddcount++;
            }
        }

        if (oddcount == 0) {
            System.out.println("No odd numbers found in the array.");
            return;
        }

        int[] oddArray = new int[oddcount];
        int idx = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                oddArray[idx] = myArray[i];
                idx++;
            }
        }

        System.out.println("Odd numbers in the array:");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.println(oddArray[i]);
        }
    }

    public static void main(String[] args) {
        PrintOddNumber printArray = new PrintOddNumber();
        printArray.printOddArray();
    }
}