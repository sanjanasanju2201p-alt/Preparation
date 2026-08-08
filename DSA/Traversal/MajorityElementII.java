package Preparation.DSA.Traversal;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int count1=0;
        int max2=Integer.MIN_VALUE;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0&&nums[i]!=max2){
                max1=nums[i];
                count1=1;
            }
            else if(count2==0&&nums[i]!=max1){
                max2=nums[i];
                count2=1;
            }
            else if(nums[i]==max1){
                count1++;
            }
            else if(nums[i]==max2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        ArrayList <Integer> list=new ArrayList <>();
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==max1){
                count1++;
            }
            if(num==max2){
                count2++;
            }
        }
        if(count1>nums.length/3){
          list.add(max1);
        }
        if(count2>nums.length/3){
          list.add(max2);
        }
        return list;
    }
    public static void main(String[] args) {
        int nums[]={2,2,2,6,6,6};
        System.out.println(majorityElement(nums));

    }

}
    

