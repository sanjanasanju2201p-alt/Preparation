class Threesum{
    public static int threeSum(int a[]){
        int i=0; int n=a.length;
        int j=i+1;  int sum=0;
        int k=n-1;
        for(i=0;i<n;i++){
            while(j<k){
                sum=a[j]+a[i]+a[k];
                if(sum==0){
                    return sum;
                else if (sum>0){
                    k--;
                else{
                    j++;
                }

                
            }

                }
            }
            }
        }
        public static void main(String[] args) {
            int a[]={-1,0,1,2,3};
            threeSum(a);

        }
    }