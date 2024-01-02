import java.util.Scanner;

public class Recursion2 {

    // Qus. 1 Print number from n to 1 (Decreasing order)..
    public static void printDec(int n){
        // base case..
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" " );
        printDec(n-1);
    }

    // Ques-2 Print number from 1 to n (Increasing order)
     public static void printInc(int n){
        // base case.
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " " );
    }


    // Ques-3 Print your name n times.... 
    public static void printName(int i, int n){
        if(i>n){
            return;
        }
        System.out.print("dhruv" + " ");
        printName(i+1, n);
    }

    // 'or' Ques-1 Print n to 1 (Dceresing )....
    public static void Print(int i, int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        Print(i-1, n);
    }

    
    // 'or' Ques-2 Print 1 to n (Increasing...)
    public static void print(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        print(i+1, n);
    }


      // ques-4 Sum of first N numbers......
    public static void Sumfun(int i, int sum){
        //base case
        if(i<1){
            System.out.println(sum);
            return;
        }
        Sumfun(i-1, sum+i);
    }

    // Ques-5 factorial of N numbers...
    public static void factFun(int i, int fact){
        // base case
        if(i<1){
            System.out.println(fact);
            return;
        }
        factFun(i-1, fact*i);
    }


    // Ques-6 Reverse an Array.... 
    public static void printArray(int arr[], int n){
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void ReverseArray(int arr[], int start, int end){
        if(start<end){                // Base case..
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            ReverseArray(arr, start+1, end-1);
        }
    }



    // Ques-07 String is palindrome or not.... ?? (Recursive).
    static boolean Palindrome(int i, String str){
        // Base Case
        if(i>=str.length()/2){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            return false;
        }
        return Palindrome(i+1, str);
    }


    // 'or' Code Palindrome ...... '
    static boolean Palindromee(String str){
        int left=0, right=str.length()-1;
        while(left<right){
            // Special Character... 
            char l=str.charAt(left);
            char r=str.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            // for Ignoring Upper case or lowercase
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }


    // Ques-8 Fibonacci Number.... 0 1 1 2 3 5 8 13      {last 2 digit numbers of a no.}/..(Recursive)
    public static int fib(int n){
        // Base Case...
        if(n==0 || n==1){
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        int fn= f1+f2;
        return fn;
    }
    








    public static void main(String args[]){
        // Qu-1 
        int n=5;
        // printDec(n);

        // Ques-2 
        // printInc(n);

        // Ques-3
        // printName(1, n);

        // 'or' Ques-1 
        // Print(n, n);

        // 'or' Ques-2
        // print(1, n);

        // Ques-4 ... 
        // int n=5;
        // Sumfun(n, 0);

        // Qus- 5 Factorial
        // factFun(n, 1);


        // Ques-6.. 
        int arr[]={5,4,3,2,1};
        // ReverseArray(arr, 0, n-1);
        // printArray(arr, n);

        // Ques-7 Palindrome
        // String str="ABCDCBA";
        // System.out.print(Palindrome(0, str));

        // 'or' Palindrome Code ... 
        // Scanner sc=new Scanner(System.in);
        // String str=sc.next();
        // boolean ans=Palindromee(str);
        // if(ans==true){
        //     System.out.print("Palindrome");
        // }
        // else{
        //      System.out.print(" Not Palindrome");
        // }


        // Fibonacci Number..... 
        n =7;
        // if(n==0){
        //     System.out.print(n);
        // }
        // int fib[]=new int[n+1];
        // fib[0]=0;
        // fib[1]=1;
        // for(int i=2;i<=n;i++){
        //     fib[i]=fib[i-1]+fib[i-2];
        // }
        // for(int i=0;i<=n;i++){
        //     System.out.print(fib[i]+" ");
        // }


        // "or " Fibonacci Recursive.
        System.out.print(fib(n));

        





    }
}
