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


    }
}