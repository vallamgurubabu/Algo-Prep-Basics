package Strings;

import java.util.*;
public class SwapString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(swap(str));
    }
    public static String swap(String str){
        char ch[] = str.toCharArray();
        String ans = "";
        int left = 0;
        int last = ch.length-1;
        while(left<=last){
           char temp = ch[left];
           ch[left] = ch[last];
           ch[last] = temp;
           left = left+2;
           last = last-2;
        }
        for(int i=0;i<ch.length;i++){
            ans+=ch[i];
        }
        return ans;
    }
}
