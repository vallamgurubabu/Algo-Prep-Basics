package Strings;

import java.util.Scanner;

public class CountSubArraysAtListOneCharVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String subStr = str.substring(i, j+1);
                System.out.println(subStr);
                if(isStringHaveVowel(subStr)){
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();

    }
    public static boolean isStringHaveVowel(String str){
        char ch[] = str.toLowerCase().toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                return true;
            }
        }

        return false;
    }
    
}