public class EasyArray{

    // 01. Largest Element in an Array....
     static int largestElement(int[] arr, int n) {
        // Write your code here.
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
           if(largest<arr[i]){
               largest=arr[i];
           }
        }
        return largest;
    }

    
    // 02.. Second largest and smallest element in an Array...
    






    
    public static void main(String args[]){

    }
}