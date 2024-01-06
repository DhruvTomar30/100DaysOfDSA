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

    public static void nTrianglenums(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");        // 1  1 2    1 2 3
            }
            System.out.println();
        }
    }

    public static void samenTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");                // 1
                                                        // 2 2   and 3 2 3 
            }
            System.out.println();
        }
    }

    public static void seeding(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void nNumberTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }










    public static void main(String args[]){
        int n=3;
        // nStarTriangle(n);
        // nForest(n);
            nRForest(n);
            nTrianglenums(n);
            seeding(n);
            nNumberTriangle(n);
            samenTriangle(n);




    }
}