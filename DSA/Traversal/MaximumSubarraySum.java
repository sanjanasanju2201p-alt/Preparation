package Preparation.DSA.Traversal;
public class MaximumSubarraySum {
public static int maximumSubarraySum(int nums[]){
    int max=Integer.MIN_VALUE;
    int sum=0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        max=Math.max(max, sum);
        if(sum<0){
            sum=0;
        }

    }
    if(max<0){
        return 0;
    }
    return max;

}


    public static void main(String[] args) {
        
    
    int nums []={-2,-3,4,-1,-2,1,5,-3};
    System.out.print("maximum subarray sum :"+maximumSubarraySum(nums));
    
}
}