public class Patterns3 {
    public static void nLetterTriangle(int n) {
        for(int i=0;i<n;i++){
            char ch='A';
            for(int j=0;j<=n-i-1;j++){
                
                System.out.print(ch+ " ");
                ch++;
            }
            System.out.println();
        }
    }
}
