package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindrome(str)); 
        sc.close();
    }
    public static boolean palindrome(String strd){
        String str = strd.replace(" ","").toLowerCase();
        int first=0;
        int last = str.length()-1;
        while (first<=last) {
            if(str.charAt(last)!=str.charAt(first)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}

    

