import java.util.*;
public class Rangesumquery {
    public static void preSum(int arr[],int pre[]){
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            
            
            pre[i]=arr[i]+pre[i-1];
            

        }
    }
    public static int rangeSumQuery(int l,int r,int pre[]){
int sum;
if(l==0){
    sum=pre[r];
} 
else{
    sum=pre[r]-pre[l-1];
}
return sum;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={2,3,4,6,8};
         int pre[]=new int[5];
         preSum (arr, pre);
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(rangeSumQuery( l, r, pre));
        

    }
}
