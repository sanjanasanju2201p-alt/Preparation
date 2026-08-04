package Preparation.DSA.Traversal;

public class IsSorted {
    public static boolean isSorted(int arr [],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr []={1,2,9,4};
        int n=arr.length;
        if (isSorted(arr, n)){
            System.out.println("the array is sorted");
        }
        else{
            System.out.println("the array is not sorted");
        }
        
    }
    
}
