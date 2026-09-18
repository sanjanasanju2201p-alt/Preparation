package Preparation.DSA.InPlaceModification;

import java.util.Arrays;

public class Sort012 {
    public static void sort(int arr[]){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int t=arr[mid];
                arr[mid]=arr[low];
                arr[low]=t;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int t=arr[mid];
                arr[mid]=arr[high];
                arr[high]=t;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
            int arr[]={1,0,2,1,2,0};
            int count0=0;
            int count1=0;
            int count2=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    count0++;
        
                }
                else if(arr[i]==1){               //better approach
                    count1++;
                }
                else{
                    count2++;
                }

            }
            for(int i=0;i<count0;i++)arr[i]=0;
            for(int i=count0;i<=count1+count1;i++)arr[i]=1;
            for(int i=count1+count0;i<arr.length;i++)arr[i]=2;
            System.out.println(Arrays.toString(arr));
            sort(arr);
    }
    
}
