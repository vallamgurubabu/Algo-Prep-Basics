package Pattren;
//      *
//     * *
//    *   *
//   *     *
//  *       *
// *         *
//  *       *
//   *     *
//    *   *
//     * *
//      *
public class HollowDiamondPyramid {
    public static void main(String[] args) {
        int n =6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==1||j==1||j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
             for(int j=1;j<=n-i;j++){
                System.out.print(" ");
             }
             for(int j=i;j>=1;j--){
                if(j==i||j==1||i==1||i==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
             }
             System.out.println();

        }
    }
}
