import java.util.*;
public class PatternsCode{

    // Pyramid..
    public static void nStarTriangle(int n) {
         for(int i=1; i<=n;i++){
            for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                    System.out.print("* ");
            }
            for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void nForest(int n) {
        // Write your code here	
        for(int i=1; i<=n; i++){
		    for(int j=1; j<=n; j++){
			    System.out.print("* ");
		    }
             System.out.println();
		}
       
    }
    

    public static void nRForest(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }













    public static void main(String args[]){
        int n=3;
        // nStarTriangle(n);
        // nForest(n);
            nRForest(n);




    }
}