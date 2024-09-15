package Arrays;
// 1 2 3 4
// 1 4 3 4
// 1 2 1 4
// 1 2 3 9
// 15, 10
public class DiagonalSum {
    public static void main(String[] args) {
        int n = 4;
        int [][] arr = {{1,2,3,4},
                        {1,2,3,4}, 
                        {1,2,3,4},
                        {1,2,3,9},};
        int i = 0;
        int j = 0;
        int dsx = 0;
        while(i<n&&j<n){
            dsx+=arr[i][j];
            i++;
            j++;
        }
        int k = 0;
        int l = n-1;
        int dsy = 0;
        while(k<n&&l>=0){
            dsy+=arr[k][l];
            k++;
            l--;
        }
        System.out.println(dsx);
        System.out.println(dsy);
    }
}
