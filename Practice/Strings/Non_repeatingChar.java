package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Non_repeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(nonrepeating(str)); 
        sc.close();
    }
    public static char nonrepeating(String str){
        char ch = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
            ch = c;
            break;
        }
        }
        return ch;

    }
}
