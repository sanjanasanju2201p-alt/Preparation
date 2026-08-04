package Preparation.DSA.Traversal;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static ArrayList<Integer> leaderInArray(int arr [],int n){
        ArrayList <Integer> ans=new ArrayList<>();
        int leader = arr[n-1];
        ans.add(leader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=leader){
                leader=arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        int n=arr.length;
        ArrayList<Integer> result =leaderInArray(arr,n);
        System.out.println(result);
    }
    
}
