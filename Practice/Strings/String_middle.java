package Strings;

import java.util.Scanner;

public class String_middle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        int n = str.length();
        int div = 0;
        if(n%2==0){
            div = n/2;
        }else{
            div = (n+1)/2;
        }
        String ans = ""; 
        int spaces = n-2;
        for(int i=div-1;i<n;i++){
            for(int j =spaces;j>=0;j--){
              System.out.print(" ");
            }
            ans+=str.charAt(i);
            System.out.println(ans);
            spaces--;
        }
        for(int i=0;i<div-1;i++){
            for(int j =spaces;j>=0;j--){
                System.out.print(" ");
              }
            ans+=str.charAt(i);
            System.out.println(ans);
            spaces--;
        }
        sc.close();
    }
}
