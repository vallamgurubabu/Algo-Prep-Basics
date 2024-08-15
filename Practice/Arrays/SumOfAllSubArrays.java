import java.util.Scanner;

public class SumOfAllSubArrays {
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
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int occ = (i+1)*(j+1)*(n-i)*(m-j);
                ans += (occ*arr[i][j]);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
