package Pattren;
public class SquareHollowPattern {
    public static void main(String[] args) {
        int n = 6;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n){
                    System.out.print("*");
                }else{
                    if(j==1||j==n){
                        System.out.print("*");  
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
