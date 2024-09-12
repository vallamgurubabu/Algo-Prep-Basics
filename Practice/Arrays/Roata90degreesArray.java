package Arrays;

import java.util.Scanner;

public class Roata90degreesArray {
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
        transpose(arr);
        for(int i=0;i<n;i++){
            int temp [] = arr[i]; 
            reverse(temp);
            arr[i] = temp;   
        }
        System.out.println("Roata90degreesArray");
        System.out.println("====================");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
 sc.close();

    }
    public static void transpose(int arr[][]){
        int n = arr.length;
        for(int i=1;i<n;i++){
           for(int j =0;j<i;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
           }
        }
    }
    public static void reverse(int arr[]){
        int last = arr.length-1;
        int first = 0;
        while(first<=last){
            int temp = arr[first];
            arr[first] =  arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
