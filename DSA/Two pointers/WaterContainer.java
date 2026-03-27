public class WaterContainer {
    public static int waterContainer(int a[]){
        int i=0; int maxArea=0;
        int j=a.length-1;
        while(i<j){
            int width=j-1;
            int area=Math.min(a[i],a[j])*width;
            maxArea=Math.max(maxArea, area);
            if (a[i]<a[j]){
                i++;
            }
            else{
                j--;
            }
    
        }
        return maxArea;


    }
    public static void main(String[] args) {
        int a[]={1,5,6,3,8,9};
        System.out.println(waterContainer(a));
    }
    
}
