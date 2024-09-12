package Pattren;

public class NumberTriangle {
    public static void main(String[] args) {
        int n = 6;
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(i+1+" ");
                
            }
            System.out.println("");
        } 
    }
    
}
