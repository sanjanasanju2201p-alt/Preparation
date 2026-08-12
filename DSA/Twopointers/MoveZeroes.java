public class MoveZeroes {
    public static void moveZeroes(int a[]){
        int j=0;
        int n=a.length;
        for(int i=0; i<n;i++){           // i= traverse
            if(a[i]!=0){                 //j= place non zero digits (swap)
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j++;

            }

        }
    }
    public static void main(String[] args) {
        int a[]={1,0,3,5,0};
        moveZeroes(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }


    }
}