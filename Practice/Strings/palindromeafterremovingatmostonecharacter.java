package Strings;

import java.util.Scanner;

public class palindromeafterremovingatmostonecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    System.out.println(Check(str, 0, str.length()-1));
    }
    public static boolean Check(String str,int left,int right){
        while (left<=right) {
            if(!plaindrome(str,left,right)){
                return (plaindrome(str,left+1,right)||plaindrome(str,left,right-1));
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean plaindrome(String str,int left,int right){
          while(left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
          }
          return true;
    }
    
}
