package Arrays;

import java.util.Scanner;
public class SumRegion2DArray {
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
        
        int prefix[][] = prefixsum(arr, n, m); 
        System.out.println("Prefix Sum");
        System.out.println("==================");
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(prefix[i][j]+" ");
            }
            System.out.println();
        }
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("->"+sumInRange( x1, y1, x2, y2,arr,n,m));
       sc.close();
    }
    public static int sumInRange(int x1,int y1,int x2,int y2, int arr[][], int n, int m ){
    int prefix[][] = prefixsum(arr, n, m);
    int sum = prefix[x2][y2];
    if (x1 > 0) {
        sum -= prefix[x1 - 1][y2];
    }
    if (y1 > 0) {
        sum -= prefix[x2][y1 - 1];
    }
    if (x1 > 0 && y1 > 0) {
        sum += prefix[x1 - 1][y1 - 1];
    }
    return sum;

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
