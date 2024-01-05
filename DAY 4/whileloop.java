import java.util.*;
public class whileloop{
        // While Loop Question....
    public static int sumDigitseven(int n) {
		int even = 0;
		int odd = 0;
		
	 while(n>0){
		int lastDigit = n % 10;
		if (lastDigit % 2 == 0) {
			even += lastDigit;
		} else {
			odd += lastDigit;
		}
		n=n/10;
	}
        return odd;
	}
	public static int sumDigitsodd(int n) {
		int even = 0;
		int odd = 0;
		
	 while(n>0){
		int lastDigit = n % 10;
		if (lastDigit % 2 == 0) {
			even += lastDigit;
		} else {
			odd += lastDigit;
		}
		n=n/10;
	}
        return even;
	}


    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
		// int n=sc.nextInt();
		// System.out.print(sumDigitsodd(n)+" "+sumDigitseven(n));


        // Area of Rectangle....
        Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int B=sc.nextInt();
		int A=L * B;
		System.out.print(A);
		
    }
}