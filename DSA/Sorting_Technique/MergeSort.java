package Preparation.DSA.Sorting_Technique;

public class MergeSort {
    public static void mergeSort(int arr[],int si,int ei,int mid){
        int merge[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid&&idx2<=ei){
            if(arr[idx1]>arr[idx2]){
                merge[x++]=arr[idx2++];
            }
            else{
                merge[x++]=arr[idx1++];
            }


        }
        while(idx1<=mid){
            merge[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merge[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<merge.length;i++,j++){
            arr[j]=merge[i];

        }

    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        mergeSort(arr,si,ei,mid);
    }
    public static void printArray(int arr[]){
        for(int num:arr){
            System.out.println(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,9,1};
        int si=0;
        int ei=arr.length-1;
        divide(arr,si,ei);
        printArray(arr);
    }
}
