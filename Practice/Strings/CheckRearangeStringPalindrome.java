package Strings;

import java.util.Scanner;

public class CheckRearangeStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(canFormPalindrome(str));
    }
    public static boolean canFormPalindrome(String str) {
        int[] charCount = new int[256];
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }
        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount<=1;
    }
    
}
