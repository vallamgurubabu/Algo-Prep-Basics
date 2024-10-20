package Basics;
//write a java program to check a number divisible by 2 and 4 but not divisible by 6 print suitable message
//1.java.lang.ClassNotFoundException
 // 2.java.lang.ClassNotFoundExceptio
 //3.Could not find or load main class
 //4.compile and run
 //5.compile and run 
        class Logicalnot{
            public static void main(String [] args){
            int num = 8;
            String ans = num%2==0 && num%4==0 && !(num%6==0) ? "Divisible by either 2 And 4 but not by 6":"Not Divisible by either 2 And 4 but not by 6";
            System.out.println(ans);
            }
            }
        
