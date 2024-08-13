package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class ChechUniqe {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    System.out.println(hasAllUniqueChars(str));
   } 

public static boolean hasAllUniqueChars(String str) {
    HashSet<Character> set = new HashSet<>();
    for (char c : str.toCharArray()) {
        if (!set.add(c)) {
            return false;
        }
    }
    return true;
}
}
