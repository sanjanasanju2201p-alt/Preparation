package Preparation.DSA.Twopointers;
public class LeftRotateArray {
    public static void leftRotate(int arr[]){
        int i=0;
        int j=1;
         
        for(i=0;i<arr.length;i++){
            if(j<arr.length){
            int t=arr[j];
            arr[j]=arr[i];
            arr[i]=t;
            j++;
        }
        //OR
         j = 0;
        int first = arr[0];

        for ( i = 1; i < arr.length; i++) {
            arr[j] = arr[i];
            j++;
        }

        arr[j] = first;
    
    }
    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        leftRotate(arr);
        for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
        }
        
    }
    
}
