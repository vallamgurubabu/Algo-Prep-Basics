package Pattren;
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20 21
public class NumberChangingPyramidPattern {
    public static void main(String[] args) {
        int n = 6;
        int num=1;
        for(int i=0;i<n;i++){
            for(int j = 1;j<=i+1;j++){
                System.out.print(num+++" ");
            }
            System.out.println("");
        }
    }
}
