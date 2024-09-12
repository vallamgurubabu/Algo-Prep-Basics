package Arrays;

import java.util.Scanner;
public class RotateLeft {

    public static void rotateRightArray(int arr[],int k){
        int n = arr.length;
        k=k%n;
        swap(arr,0,n-1);
        swap(arr, 0, n-k-1);
        swap(arr, n-k, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Enter Elements : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number of rotations : ");
        int k =sc.nextInt();
        sc.close();
        rotateRightArray(arr,k);
        System.out.println("Final Output : ");
        System.out.print("[ ");
        for(int i=0;i<n;i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ]");
    }
    public static void swap(int []arr,int fst,int lst){
        int last = lst;
        int first=fst;
        while(first<=last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

}
