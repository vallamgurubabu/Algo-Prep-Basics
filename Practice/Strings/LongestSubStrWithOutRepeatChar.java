package Strings;
import java.util.HashMap;
import java.util.Scanner;

public class LongestSubStrWithOutRepeatChar {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longestSubStrWithOutRepeatChar(str)); 
        sc.close();
    }
    public static String longestSubStrWithOutRepeatChar(String str){
        String ans = "";
        int max_len = 0;
        int left = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int right =0;right<str.length();right++){
            if(hm.containsKey(str.charAt(right))){
                left = Math.max(left,hm.get(str.charAt(right))+1);
            }
            hm.put(str.charAt(right),right);
            if(right-left+1>max_len){
                max_len = right-left+1;
                ans = str.substring(left, right+1);
            }
            
        }
        return ans;
    }
}
