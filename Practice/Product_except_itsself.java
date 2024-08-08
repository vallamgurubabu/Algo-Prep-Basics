import java.util.*;
public class Product_except_itsself {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        long prefix[] = prefix_product(arr,n);
        long suffix = 1;
        for (int i = n - 1; i > 0; i--) {
            prefix[i] = suffix * prefix[i - 1];
            suffix *= arr[i];
        }
        prefix[0] = suffix;


        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+"  ");
        }
    
        
    }
    public static long[] prefix_product(int arr[],int n ){
         long prefix[] = new long[n];
         prefix[0] = arr[0];
         for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]*arr[i];
         }
         return prefix;
    }
    
}
