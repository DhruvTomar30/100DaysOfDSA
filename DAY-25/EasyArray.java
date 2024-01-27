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
    public static int[] getSecondOrderElements(int n, int []arr) {
        int secondLargest=Integer.MIN_VALUE, largest=Integer.MIN_VALUE;
        int secondSmallest=Integer.MAX_VALUE, smallest=Integer.MAX_VALUE; 

        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }

        for(int i=0; i<arr.length;i++){
           if(smallest>arr[i]){
               secondSmallest=smallest;
               smallest=arr[i];
           }
           else if(arr[i] < secondSmallest && arr[i] != smallest){
               secondSmallest=arr[i];
           }
        }
        int result[]={secondLargest, secondSmallest};
        return result;
    }






    
    public static void main(String args[]){

    }
}