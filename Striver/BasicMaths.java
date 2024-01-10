import java.util.*;

public class BasicMaths {
    // 1. Counting digits of a number... 
    public static int counting(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            count++;
        }
        System.out.print(count);
        return count;
    }



     // <-------- Prime or not------ >
    public static void isPrime(int n){
        if(n==2){
            System.out.print("it is prime");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isPrime=false;
                }
            }

            if(isPrime==true){
                System.out.print("It is Prime");
            }
            else{
                System.out.print("It is not Prime");

            }
            
        
        }
        
    }


       
    public static void main(String args[]){
        // <------- counting of a number------->
        // int n=5;
        // counting(n);
        
       
        // <------- Reverse of a number...-------->
         // int n=10899;
        // int rev=0;
        // while(n>0){
        //     int lastdigit=n%10;
        //     rev=(rev*10)+lastdigit;
        //     n=n/10;
         
        // }
        // System.out.print(rev);



        // <----------------  Palindrome Code....
        // int n=121;
        // int temp;
        // temp=n;
        // int rev=0;
        
        // while(n>0){
        //     int lastdigit=n%10;
        //     rev=(rev*10)+lastdigit;
        //     n=n/10;
        // }
        // if(rev==temp){
        //     System.out.print("number is a palindrome");
        // }
        // else{
        //     System.out.print("number is not a palindrome");
        // }



        // <--------- GCD Greatest common factor ---------->

      int num1 = 3, num2 = 6;
      int ans = 1;
      for (int i = 1; i <= Math.min(num1, num2); i++) {
        if (num1 % i == 0 && num2 % i == 0) {
          ans = i;
        }
      }
      System.out.print("The GCD of the two number is "+ans);




    // <----------- Armstrong Number.-------->
    // int sum=0;
    // // int n=155;
    // int temp;
    
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();

    // temp=n;

    // while(n>0){
    // int lastdigit=n%10;
    // int cube=lastdigit*lastdigit*lastdigit;
    // sum+=cube;
    // n=n/10;
    // }
    // if(temp==sum){
    //     System.out.print(" It is a Armstrong");
    // }
    // else{
    //     System.out.print(" It is not a Armstrong");
    // }




    // <--------- Print all Divisors of a given Number -------->
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    //  for(int i=1;i<=n;i++){
    //     if(n%i==0){
    //         System.out.print(i +" ");
    //     }
    // } 
    //  System.out.println();
  
  

   
    Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        isPrime(n);
    





    }
}