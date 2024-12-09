package Basics;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args){
        int arr[] ={10,20,40,50,60};
        int element =30;
        int index=2;
        int n=arr.length;

        // kabhi bhi starting me insert nhi kr rhe hote array mai,then make it using the new keyword
        int newArr[]=new int[n+1];
        

        for(int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        newArr[index]=element;

        for(int i=index;i<n;i++){
             newArr[i+1] = arr[i];
        }

        // converted array into String otherwise it will give garbage value if not converted into String
        System.out.println(Arrays.toString(newArr));
    }
}



// time complexity= 0(N);
// Sapce Complexity=0(N);