package Strings;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(removeDuplicates(str));
    }
    public static String removeDuplicates(String str) {
    HashSet<Character> set = new HashSet<>();
    StringBuilder sb = new StringBuilder();
    for (char c : str.toCharArray()) {
        if (set.add(c)) {
            sb.append(c);
        }
    }
    return sb.toString();
}

}
