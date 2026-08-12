import java.util.*;
public class RemoveElement {
    public static int removeElement(int a[], int var){
        int i=0; int j=0;
        for(i=0;i<a.length; i++){
            if(a[i]!=var){
                a[j]=a[i];
                j++;
            }

        }
        return j;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int [size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int var=sc.nextInt();
        int k=removeElement(a , var);
         for(int i=0;i<k;i++){
            System.out.println(a[i]);
        }
        

    }
    
    
}
