import java.util.*;
class SortedSquare{
    public static int[] sortedSquare(int a[]){
        int n=a.length;
        int result[]=new int [n];
        int left=0;                    int lsquare; int rsquare;
        int right=n-1; int index=n-1;
        while(left<=right){
            lsquare=a[left]*a[left];
            rsquare=a[right]*a[right];
            if (lsquare>rsquare){
                result[index]=lsquare;
                left++;
            }
            else{
                result[index]=rsquare;
                right--;

            }
            index--;

            }
            return result;
        }
        public static void main(String[]args){
            int a[] = {-2,-1,0,3,4};

           System.out.println(Arrays.toString(sortedSquare(a))); 
            
        }

    }
