package Strings;

import java.util.Scanner;

public class ShortestPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    System.out.println(shortestPalindrome(str));
  }  

public static String shortestPalindrome(String str) {
    String rev = new StringBuilder(str).reverse().toString();
    for (int i = 0; i < str.length(); i++) {
        if (str.startsWith(rev.substring(i))) {
            return rev.substring(0, i) + str;
        }
    }
    return rev + str;
}
}
