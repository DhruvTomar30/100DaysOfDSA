import java.util.*;
public class NinjaRecursion {  

    // 01. Increasing order Code...
    static int[] nums(int n, int[] arr){
        if(n > arr.length) return arr;
        if(n<=0) return arr;
        int i=n-1;
        arr[i]=n;
        return nums(n+1, arr);
        
    }
    public static int[] printNos(int x) {
        int[] arr = new int[x];
        return nums(1, arr);
    }







    // Main ...... 
    public static void main(String args[]){
        int x=5;

        //01. [1,2,3,4,5]
        int[] result = printNos(x);
        
        // 02. [5,4,3,2,1]
         int[] result = printNos(x);
        System.out.println(Arrays.toString(result));


    }
}