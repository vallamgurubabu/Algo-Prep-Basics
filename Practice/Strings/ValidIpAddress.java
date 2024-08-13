package Strings;

import java.util.Scanner;

public class ValidIpAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(valid(str)); 
        sc.close();
    }
    public static boolean valid(String str){
        String s[] = str.split(".");
        for(String st : s){
            int num = Integer.parseInt(st);
            try{
                if(num<0||num>255){
                    return false;
                }
            }catch(Exception e)
            {
                return false;
            }
            
        }
        return true;
    }
}
