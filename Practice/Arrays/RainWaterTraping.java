import java.util.Scanner;

public class RainWaterTraping {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int prefix[] = prefix_max(arr,n);

        int suffix[] = suffix_max(arr,n);
        int count = 0;
        for(int i=1;i<n;i++){
           int a = prefix[i];
           int b = suffix[i];
           int y = Math.min(a, b);
           int contri = y-arr[i];
           if(contri>0){
             count+=contri;
           } 
        }
        System.out.println(count);
    }
    public static int[] prefix_max(int arr[],int n){
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],arr[i]);
        }
        return prefix;
    }
    public static int[] suffix_max(int arr[],int n){
        int suffix[] = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],arr[i]);
        }
        return suffix;
    }
}
