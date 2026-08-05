package Preparation.DSA.Traversal;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void majorityHashMap(int arr[]){
        //Better approach
        int n=arr.length;
        HashMap <Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            

        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            entry.getValue();
            if(entry.getValue()>n/2){
                int majority=entry.getKey();
                System.out.println("majority element is : "+majority);
                break;
            }
        }
    }
    public static int majorityElement(int arr[]){
        // Optimal solution (More's voting algorithm)
        int count =0;
        int majority=0;
        for(int num:arr){
            if(count==0){
                majority=num;
                count=1;
            }
            else if(num==majority){
                count++;
            }
            else{
                count--;
            }
        }
        return majority;

    }
    public static void main(String[] args) {
        //the majority element must exist
        int arr[]={2,2,1,1,5,2,2,2};
        majorityHashMap(arr);
        int majority=majorityElement(arr);
        System.out.println("Majority element is : "+majority);
    }
}
