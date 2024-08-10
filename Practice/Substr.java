import java.util.Scanner;

public class Substr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 =  sc.nextLine();
        System.out.println(IndexSubstr(s1,s2));
        sc.close();

    }
    public static int IndexSubstr(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int i=0;
         while (i <= n - m) {
        if (s1.substring(i, i + m).equals(s2)) {
            return i;
        }
        i++;
    }
    return -1;

    } 
}
