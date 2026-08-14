package Preparation.DSA.Traversal;

public class BBSS {
    public static int best(int arr []){
        int min=arr[0];
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            int profit=arr[i]-min;
            max=Math.max(max,profit);
        }
        
        return max;
    }
    public static void main(String[] args) {
        int arr []={7,6,4,3,1};
        System.out.println(best(arr));
        
    }
}
