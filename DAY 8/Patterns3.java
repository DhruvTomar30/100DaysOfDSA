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

    // 4th code...
    public static void symmetry(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            // stars
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*"+" ");
            }
            // spaces
            for(int j=1;j<=(2*i)-2;j++){
                 System.out.print(" ");
            }
            // stars
             for(int j=1;j<=n-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        // lower symmetry... 
        for(int i=1;i<=n;i++){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            // spaces
            for(int j=1;j<=(2*n-2*i);j++){
                 System.out.print(" ");
            }
            // stars
             for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    
	public static void symmetry(int n) {
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for (int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i =n-1;i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for (int j = 1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }   


	// Hollow Rhombus..
	public static void getStarPattern(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
	









    public static void main(String args[]){
        int n=3;
        symmetry(n);
    }
}
