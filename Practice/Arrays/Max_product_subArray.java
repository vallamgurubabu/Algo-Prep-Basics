package Arrays;

import java.util.Scanner;

public class Max_product_subArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = arr[0];
        int maxProduct = arr[0];
        int minProduct = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            ans = Math.max(ans, maxProduct);
        }

        System.out.println(ans);

    }
}
