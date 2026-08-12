import java.util.Scanner;



public class Validpalindrome {
    public static boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;

            }
            l++;
            r--;
        }
        return true;

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        System.out.println("The given string is palindrome??"+"  "+isPalindrome( s));
        
    }
    
}
