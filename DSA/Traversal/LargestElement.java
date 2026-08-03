package Preparation.DSA.Traversal;
import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int j=0;j<arr.length;j++){
            if(arr[j]>largest){
                largest=arr[j];
            }

        }
        System.out.println("largest: "+largest);
    }
    
}
