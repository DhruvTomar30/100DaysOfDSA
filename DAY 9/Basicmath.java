import java.util.*;
public class Basicmath{
    
    // GCD of 2 numbers..
    public static int calcGCD(int n, int m){
        int ans=1;
        for(int i=1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                ans=i;
            }
            
        }
        System.out.println();
        return ans;
    }

    // All Divisors sum 
    public static int sumOfAllDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static int sumOfDivisorsInRange(int n) {
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += sumOfAllDivisors(i);
        }
        return totalSum;
    }

        // 'or'
    public static int sumOfAllDivisorss(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(n/i)*i;
        }
        return sum;
    }


    
    

    
    
    
    
    
    
    
    
    
    
    
    
    // Main....
    public static void main(String[] args) {

        // ArmString O(logn)...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int numDigits = (int) Math.log10(n) + 1;

        while (n > 0) {
            int lastDigit = n % 10;
            int poweredDigit = (int) Math.pow(lastDigit, numDigits);
            sum += poweredDigit;
            n = n / 10;
        }

        if (temp == sum) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }

















}
