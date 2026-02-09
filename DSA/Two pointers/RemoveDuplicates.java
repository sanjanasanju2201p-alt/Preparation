import java.util.Scanner;

public class RemoveDuplicates {
    public static int removeDuplicates(int a[]){
        int i=0;
        int j=1; 
        for(j=1;j<n;j++){

        if(a[i]!=a[j]){
            i++;
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
        removeDuplicates(a);
        System.out.println(a);

    }
}
