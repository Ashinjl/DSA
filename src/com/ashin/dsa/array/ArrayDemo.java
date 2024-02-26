package com.ashin.dsa.array;

import java.util.Scanner;

public class ArrayDemo {
    private int value;
    private int myArray[];

    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.createArray();
        arrayDemo.printArray();
    }

    public void createArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        value = scan.nextInt();
        myArray = new int[value];


        for (int i = 0; i < value; i++) {
            System.out.print("Enter the value myArray[" + i + "]: ");
            myArray[i] = scan.nextInt();
        }

        scan.close(); // Don't forget to close the scanner
    }

    public void printArray() {
        System.out.println("The array elements are:");
        for (int i = 0; i < value; i++) {
            System.out.println(myArray[i]);
        }
    }
}