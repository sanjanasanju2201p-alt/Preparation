package Preparation.DSA.Twopointers;

import java.util.Arrays;

public class Union {
    public static int [] union(int arr1[],int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int x1=0;
        int x2=0;
        int i=0;
        int arr3 []=new int [n1+n2];
        while(x1<n1&&x2<n2){
            if(arr1[x1]<arr2[x2]){
                if(i==0||arr3[i-1]!=arr1[x1]){
                    arr3[i++]=arr1[x1];
                }
                x1++;
            }
            else if(arr1[x1]>arr2[x2]){
                if(i==0||arr3[i-1]!=arr2[x2]){
                    arr3[i++]=arr2[x2];
                }
                x2++;
                
            }
            else{
                if (i == 0 || arr3[i - 1] != arr1[x1]) {
                 arr3[i++]=arr2[x1];
                }
                x2++;
                x1++;

            }
        }
    
    while(x1<n1){
       
                if(i==0||arr3[i-1]!=arr1[x1]){
                    arr3[i++]=arr1[x1];
                }
                x1++;
            }

    
    while(x2<n2){
         
                if(i==0||arr3[i-1]!=arr2[x2]){
                    arr3[i++]=arr2[x2];
                }
                x2++;
                
            }
        

    
    return Arrays.copyOf(arr3, i);
}

    public static void main(String[] args) {
        int arr1 []={1,2,2,3,4,5,6};
        int arr2[]={1,2,3,3,4,7};
        int arr3 []=union(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }
    
}
