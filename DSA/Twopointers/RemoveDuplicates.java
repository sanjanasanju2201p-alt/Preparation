import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int a[]){
        int i=0;
        int j=1; 
        for(j=1;j<=a.length-1;j++){

        if(a[i]!=a[j]){
            i++;      //we are not removing duplictes ,just overwritting array
            a[i]=a[j];
        }

    }
    return i+1; 
}
      
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int k=removeDuplicates(a);
        System.out.println(k);//total no of elements after removing duplicates
        //array after removing duplicates
        for(int i=0;i<k;i++){//<k because we want only original elements which only exist till k
        System.out.println(a[i]);

    }
}
}