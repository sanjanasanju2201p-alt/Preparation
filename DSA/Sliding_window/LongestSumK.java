package Preparation.DSA.Sliding_window;

public class LongestSumK {
    public static int longestSum(int arr [],int k){
        int left=0;
        int right=0;
        int maxl=0;
        int sum=arr[0];
        int n=arr.length;
        while(right<n){
            while(sum>k){
                sum-=arr[left];
                left++;

            }
            if(sum==k){
                maxl=Math.max(maxl, right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxl;

    }
    public static void main(String[] args) {
        int arr []={2,0,0,3};
        int k=3;
        int l=longestSum(arr,k);
        System.out.println(l);
    }
    
}
