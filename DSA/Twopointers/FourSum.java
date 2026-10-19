package Preparation.DSA.Twopointers;
import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int arr []){
        Arrays.sort(arr);
        List<List<Integer>> list =new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n-3;i++){
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
           

            for(int j=i+1;j<n-2;j++){
                  if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }
            
            int left=j+1;
            int right=n-1;
            while(left<right){
                int sum=arr[left]+arr[right]+arr[j]+arr[i];
                if(sum==0){
                    list.add(Arrays.asList(arr[left],arr[right],arr[j],arr[i]));
                    left++;
                    right--;
                    while(left<right&&arr[left]==arr[left-1])left++;
                    while(left<right&&arr[right]==arr[right+1])right--;
                    
                    

                    

                }
                else if(sum>0){
                    right--;

                }
                else{
                    left++;
                }
            }
        }
    }
        return list;

    }
    public static void main(String[] args) {
        int arr []={1,0,-1,0,-2,2};
        
        
        System.out.println(fourSum(arr));

    }
    
}
