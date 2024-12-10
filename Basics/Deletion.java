package Basics;

import java.util.Arrays;

public class Deletion{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        System.out.println("Original Array is:");
        System.out.println(Arrays.toString(arr));
        int index=3;
        int n=arr.length;

        int newArr[]=new int[n-1];
        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        for(int j=index;j<n-1;j++){
            newArr[j]=arr[j+1];
        }
        System.out.println("Array after deletion is:");
        System.out.println(Arrays.toString(newArr));
    }
}
