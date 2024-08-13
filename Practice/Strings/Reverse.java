package Strings;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str)); 
        sc.close();
    }
    public static String reverse(String str){
        int low = 0;
        int high = str.length()-1;
        char ch[] = str.toCharArray();
        while(low<=high){
             char temp = ch[low];
             ch[low] = ch[high];
             ch[high] = temp;
             low++;
             high--;
        }
        return String.valueOf(ch);
    }
   
}
