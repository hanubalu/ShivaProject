package com.insertion_sort;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] arr = {25, 10,58,47,36};
        iSort(arr);
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);

        }
     }
    public static void iSort(int[] arr){

    int len = arr.length;
    for(int j=1;j<len;j++)
    {
    int key = arr[j];
    int i=j-1;
    while ((i>-1) && (arr[i]>key)){

        arr[i+1]=arr[i];
        i--;
    }
    arr[i+1]=key;
         }
    }
}
