package Preparation.DSA.Traversal;

public class SecondLargest {
    public static int secondLargest(int arr[],int n){
        int largest=arr[0];
        int slarge=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slarge=largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest&&arr[i]>slarge){
                    slarge=arr[i];
            } 
        }
        return slarge;
    }
    public static int secondSmallest(int arr[],int n){
        int smallest=arr[0];
        int ssmall=Integer.MAX_VALUE;
        for(int j=1;j<n;j++){
            if(arr[j]<smallest){
                ssmall=smallest;
                smallest=arr[j];
            }
            else if(arr[j]!=smallest&&arr[j]<ssmall){
                    ssmall=arr[j];
                }
        }
        return ssmall;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int slargest=secondLargest(arr,n);
        int ssmallest=secondSmallest(arr,n);
        System.out.println("Second largest : "+slargest+"\nSecond smallest : "+ssmallest);
    }
}
