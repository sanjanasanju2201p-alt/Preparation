import java.util.*;
public class RangeSumQuery {
    public static void preSum(int arr[],int pre[]){
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
        int l=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(rangeSumQuery( l, r, pre));
        

    }
}
