import java.util.HashMap;

public class SubarrayXOR {
    public static int subarrayXOR(int arr [],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
       int count=0;
       int xor=0;
       for(int i=0;i<arr.length;i++){
         xor=xor^arr[i];
        int need =xor^k;
        if(map.containsKey(need)){
        count+=map.get(need);
       }
        map.put(xor,map.getOrDefault(xor,0)+1);
       }
       
        return count;

    }
    public static void main(String[] args) {
        int arr []={5,6,7,8,9};
        int k=5;
       int xor= subarrayXOR(arr,k);
       System.out.println(xor);
    }
}
