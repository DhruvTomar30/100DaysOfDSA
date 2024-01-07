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

    // 












    // Main ..... 
    public static void main(String args[]){

    }
} 