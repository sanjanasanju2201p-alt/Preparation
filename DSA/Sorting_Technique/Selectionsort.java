public class Selectionsort {
    public static void printa(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[smallest]){
                    smallest =j;
                
                }
            }
            int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

        }
        printa(arr);
        
    }
    
}
