package Preparation.DSA.InPlaceModification;

public class Singlenumber {
    public static int singleNumber(int arr []){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1};
        int single=singleNumber(arr);
        System.out.println(single);
    }
    
}
