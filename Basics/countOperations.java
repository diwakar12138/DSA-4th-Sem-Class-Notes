package Basics;

public class countOperations {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5};
        int sum=0;
        int operations=-1;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            operations++;
        }
        System.out.println(sum);
        System.out.println(operations);
    }
}
