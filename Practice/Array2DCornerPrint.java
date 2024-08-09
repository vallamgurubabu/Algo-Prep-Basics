import java.util.Scanner;

class Array2DCornerPrint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        cornerPrint(arr,n);
    
    }
    public static void cornerPrint(int arr[][], int n) {
        // Print top row
        for (int j = 0; j < n; j++) {
            System.out.print(arr[0][j] + " ");
        }
    
        // Print right column
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i][n - 1] + " ");
        }
    
        // Print bottom row
        for (int j = n - 2; j >= 0; j--) {
            System.out.print(arr[n - 1][j] + " ");
        }
    
        // Print left column
        for (int i = n - 2; i > 0; i--) {
            System.out.print(arr[i][0] + " ");
        }
    }
    
}