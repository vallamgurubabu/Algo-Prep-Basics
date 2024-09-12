package Arrays;

import java.util.Scanner;

public class PrefixSum2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int prefix[][] = prefixsum(arr, n, m); 
        System.out.println("Prefix Sum");
        System.out.println("==================");
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(prefix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] prefixsum(int arr[][],int n,int m){
          int ans[][] = new int[n][m];
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                    ans[i][j]=arr[i][j];
                }else{
                    ans[i][j]=ans[i][j-1]+arr[i][j];
                }
            }
          }
          for(int j=0;j<m;j++){
            for(int i=1;i<n;i++){
                ans[i][j] = ans[i-1][j]+ans[i][j];
            }
          }
          return ans;
    }
}
