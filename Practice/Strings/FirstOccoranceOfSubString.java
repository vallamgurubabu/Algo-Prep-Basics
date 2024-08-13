package Strings;

import java.util.Scanner;

public class FirstOccoranceOfSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(findSubstring(str1,str2)); 
        sc.close();
    }

public static int findSubstring(String str, String substring) {
    return str.indexOf(substring);
}

}
