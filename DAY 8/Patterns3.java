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


    // 2nd Code...
    public static void alphaRamp(int n) {
        // Write your code here 
        char ch='A';   
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }

    // 3rd code... 
    public static void alphaHill(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            char ch='A';
            for(int j=1;j<=2*i-1;j++){
                System.out.print(ch+" ");
                if(j<i){
                ch++;
                }
                else{
                    ch--;
                }
            
            }
            System.out.println();
        }
    }
}
