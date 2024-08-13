package Strings;

import java.util.Scanner;

public class StringContaingOnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(CheckDigitsAll(str)); 
        sc.close();
  
    }
     public static boolean CheckDigitsAll(String str){
        return str.matches("\\d+");
     }

}
