package com.ashin.dsa.sorting.algorithm;

import java.util.Arrays;

public class BubbleSort {

//    bubbleSort(array)
//          for i <- 1 to indexOfLastUnsortedElement-1
//              if leftElement > rightElement
//              swap leftElement and rightElement
//    end bubbleSort

    // perform the bubble sort
    static void bubbleSort(int array[]) {
      int size =array.length;

      for (int i=0; i<size-1; i++){
          //System.out.println(i);
          for (int j=0;j<size-i-1;j++){
              //System.out.println(j);
              if( array[j]>array[j+1]){
                  int temp= array[j];
                  array[j]=array[j+1];
                  array[j+1] = temp;
              }
          }
      }
    }

    public static void main(String args[]) {

        int[] data = { -2, 45, 0, 11, -9,9999,45,8,-3545,9756 };
        // call method using class name
        bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}


