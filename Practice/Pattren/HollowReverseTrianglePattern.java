package Pattren;
// * * * * * * 
//  *       *
//   *     *
//    *   *
//     * *
//      *
public class HollowReverseTrianglePattern {
    public static void main(String[] args) {
        int n = 6;
        for(int i=n;i>=1;i--){
            for(int j =1;j<n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if (i == n || i == 1 || j == 1 || j == i) {

                      
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                
                
            }
            System.out.println();
        }
    }
}
