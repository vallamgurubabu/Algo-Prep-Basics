package Strings;

import java.util.Scanner;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n] ;
        for(int i=0;i<n;i++){
            str[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(str)); 
        sc.close();
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        if(strs.length == 0|| strs == null){
            return " ";
        }
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                  prefix = prefix.substring(0,prefix.length()-1);
                  if(prefix.isEmpty()){
                    return " ";
                  }
            }
        }
        return prefix;
    }   
}
