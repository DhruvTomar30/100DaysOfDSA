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

    // 03. Array is Sorted or not ....
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return 0;
            }
        }
        return 1;
    }

    // 04. Remove Duplicates in the Array...
    public static int removeDuplicates(int[] arr,int n) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }


    // 05. Left Rotate an Array by one place....
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0]; 
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; 


        // Populate and return the ans array
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    // 06. Left Rotate an Array by D place to the right....
    






    // 07. Linear Search ...
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        for(int i=0;i<n;i++){
        if(arr[i]==num)
            return i;
        }
        return -1;
    }

    // 08. Find the Union... 
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        HashSet<Integer>set=new HashSet<>();
        ArrayList < Integer > Union=new ArrayList<>();

        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        
        for(int j=0;j<b.length;j++){
            set.add(b[j]);
        }
        for (int val: set){
            Union.add(val);
        }
        return Union;
    }

    // 09. Find missing numbers in an Array... 
    public int missingNumber(int[] nums) {
        int N = nums.length;
        int sum = (N * (N + 1)) / 2;

        // Summation of all array elements:
        int s2 = 0;
        for (int i = 0; i < N; i++) {
            s2 += nums[i];
        }
        int missingNum = sum - s2;
        return missingNum;
    }

    // 10. Maximum Consecutive Ones.....




    // 11. Find the number that appears once, and the other numbers twice... 




    // 12. Longest Subarray with given Sum K(Positives)..



    // 13. Longest Subarray with given Sum K(Positives and Negatives)... 

    


    // Main...... 
    public static void main(String args[]){
        int n=5; 
        int nums[]={2,5,6,1,8,7,3};

    }
}