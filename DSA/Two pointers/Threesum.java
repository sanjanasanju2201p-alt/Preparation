import java.util.*;
class Threesum{
    public static List<List<Integer>> threeSum(int a[]){
        int n=a.length;
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;

            while(left<right){
                int sum = a[i]+a[left]+a[right];
                if(sum==0){
                    result.add(Arrays.asList(a[i],a[left],a[right]));
                    while(left<right&&a[left]==a[left+1])left++;
                    while(left<right&&a[right]==a[right-1])right--;
                    left++;
                    right--;
                }
                else if(sum>0){
                    right--;

                }
                else{
                    left++;
                }

                }

        
            }
            
             return result;
                
            }

                
            
        public static void main(String[] args) {
            int a[]={-1,0,1,2,-1,-4};
            List<List<Integer>> ans=threeSum(a);
            System.out.println(ans);




        }
    }