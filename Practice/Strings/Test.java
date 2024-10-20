package Strings;

import java.util.*;
class Test{
    public static void main(String[] args) {
        //String [] words = {"abnbnb","apple","mango","banana","guva"};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] words = new String[n];
        for(int i=0;i<n;i++){
            words[i] = sc.next();
        }
        sc.close();
        HashMap<String,Integer> ans = new HashMap<>();
        int len = words.length;
        for(int i=0;i<len;i++){
           ans.put(words[i],distinctCount(words[i]));
        }
        int min = Integer.MAX_VALUE;
        String an ="";
        for(String val : ans.keySet()){
            if(ans.get(val)<min){
                min = ans.get(val);
                an = val;
            }
            System.err.println(val+" "+ans.get(val));
            
        }
        System.out.println(an);
    }
    public static int distinctCount(String str){
        int count =0;
        HashMap<Character,Integer> hs = new HashMap<>();
        int len = str.length();
        for(int i=0;i<len;i++){
            hs.put(str.charAt(i),hs.getOrDefault(str.charAt(i),0 )+1);
        }
        for(char ch : hs.keySet()){
            if(hs.get(ch)==1){
                count++;
            }
        }
        return count;
    }
}