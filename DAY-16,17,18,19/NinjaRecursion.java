import java.util.*;
public class NinjaRecursion {  

    // 01. Increasing order Code...
    static int[] IncNums(int n, int[] arr){
        if(n > arr.length) return arr;
        if(n<=0) return arr;
        int i=n-1;
        arr[i]=n;
        return IncNums(n+1, arr);
        
    }
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        return IncNums(1, arr);
    }


    // 02. Decreasing order code..
    static int[] DecNums(int n, int[] arr){
        if(n > arr.length) return arr;
        if(n<=0) return arr;
        int i=arr.length-n;
        arr[i]=n;
        return DecNums(n+1, arr);
    }

    public static int[] printNumbs(int x){
        int arr[]=new int[x];
        return DecNums(1, arr);
    }


    // 03. Print Names upto n Times..
    public static List<String> print(List<String> l, int n){
        if(n>0){
            l.add("Coding Ninjas");
            print(l, n-1);
        }
        return l;
    }

    public static List<String> printNtimes(int n){
        List<String> l= new java.util.ArrayList<>();
        return print(l,n);
    }

    // 04.. Sum of first N nautral Numbers
    public static long sumFirstN(long n) {
        return n * (n + 1) / 2;
    }

    // 05. Factorial Code....
    public static long fact(long n){
        if(n==1){
            return 1;
        }
        return (n * fact(n-1));
    }
    public static List<Long> factorialNumbers(long n) {
        
        List<Long> l= new ArrayList<>();
        if(n==1){
            l.add(n);
            return l;
        }
        else{
            for(int i=1;i<=n;i++){
                long fact=fact(i);
                if(fact<=n){
                    l.add(fact);
                }
                else{
                    break;
                }
            }

        }
        return l;
        
    }


    // 06.. Reverse an Array..
    public static int[] reverseArray(int n, int []nums) {
        int arr[]=new int[n];
        int size=nums.length;
        for(int i=0;i<=n;i++){
            if(size==0) break;
            arr[i]=nums[size-1];
            size--;
        }
        return arr;
    }

        // 'or'........

    public static void revArray(int [] nums, int start, int end){
        if(start<end){
            // swapping... 
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            revArray(nums, start+1, end-1);
        }
    }

    // 07.... String or not... 
    public static boolean isPalindrome(int i,String str) {
        // Base Case..
        if(i>=str.length()/2) 
            return true;
        if(str.charAt(i)!= str.charAt(str.length()-1-i))
            return false;
        
        return isPalindrome(i+1,str);
    }       
    
        // 'or' ...... 
    public static boolean isPalindrome(String str) {
        return isPalindromeReverse(str, 0, str.length()-1);
    }
    public static boolean isPalindromeReverse(String str, int left, int right){
        // Base case if there is only 1 value of str.
        if(left>=right)
            return true;
            
        char l=str.charAt(left);
        char r=str.charAt(right);
        
        if(!Character.isLetterOrDigit(l))
            return isPalindromeReverse(str, left+1, right);

        else if(!Character.isLetterOrDigit(r))
            return isPalindromeReverse(str, left, right-1);
        
        if(Character.toLowerCase(l)!=Character.toLowerCase(r))
            return false;
        
        return isPalindromeReverse(str, left+1, right-1);
    }

    // 08.  Fibonacci Number.... 
     public static int[] generateFibonacciNumbers(int n) {
        if (n <= 0) {
            // Handle invalid input
            return new int[0];
        }

        int[] result = new int[n];
        result[0] = 0;
        if (n > 1) {
            result[1] = 1;
            for (int i = 2; i < n; i++) {
                result[i] = result[i - 1] + result[i - 2];
            }
        }

        return result;
    }




    // Main ...... 
    public static void main(String args[]){
        int x=5;

        //01. [1,2,3,4,5]
        int[] result = printNos(x);
        
        // 02. [5,4,3,2,1]
         int[] resultt = printNumbs(x);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(resultt));

        //04. Sum code..
        long n1 = 3;
        System.out.println(sumFirstN(n1)); 

        long n2 = 5;
        System.out.println(sumFirstN(n2));


        // 06.. Reverse array..
        int n=8;
        int nums[]={3,5,6,9,12,5,3,8};
        System.out.print(Arrays.toString(reverseArray(n,nums)));


        //07.. String code..
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean ans=isPalindrome(0, str);
        if(ans==true){
            System.out.print("It is Palindrome");
        }
        else{
            System.out.print("It is not Palindrome");
        }


        // 08. fibonacci Number..... 
        int n = 10;
        int[] fibonacciNumbers =generateFibonacciNumbers(n);

        // Displaying the result
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
        



    }
}