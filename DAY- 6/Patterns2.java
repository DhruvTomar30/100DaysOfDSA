public class Patterns2{

    // Floyd's Triangle....                                1/ 2 3/  4 5 6/    /*-> means New Line...
    public static void nNumberTriangle(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++sum+" ");
            }
            System.out.println();
        }
    }

    // Binary Search Tree....
    public static void nBinaryTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((i+j+1)%2+" ");
            }
            System.out.println();
            
        }
    }

    // New Pattern....
    public static void numberCrown(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }












    // Main ..... 
    public static void main(String args[]){
        nNumberTriangle(n);
        nBinaryTriangle(n);
    }
} 