package com.ashin.dsa.searching.algorithm;

public class LinearSearch {


    public static void main(String []args){
        System.out.println("linear Search;");
        int []data ={2,5,6,7,8,4,9};
        int value = 4 ;
        linearSearch(data,value);
    }

    private static void linearSearch(int[] data, int hai) {
        int arrsize = data.length;
        for (int i=0;i<arrsize-1;i++){
            if(data[i]== hai){
                System.out.println("the value of "+hai+" is found on the array of index: "+i);


            }

        }


    }
}
