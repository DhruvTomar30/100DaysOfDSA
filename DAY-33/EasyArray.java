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

    //06. Rotate array by k elements to left...
    public static void Rotateeletoleft(int arr[], int n, int k){
        if(n==0)
            return;
        k=k%n;
        if(k>n)
            return;
        int temp[]=new int[k];
        for(int i=0; i<k; i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++){             // 0+3= 3, 1+3=4   means 3,4 index ele i.e. 4,5 comes at arr[0], arr[1]
            arr[i]=arr[i+k];
        }
        for(int i=n-k; i<n;i++){
            arr[i]=temp[i-n+k];                 //arr[2] = (2-5+3)=0 temp[0], temp[1], temp[2]= 1,2,3
        }
    }

    // Reversal Approach for rotate ele to left...
    public static void Reverse(int arr[], int start, int end){      // f(n). to reverse Array
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void Rotateleft(int arr[], int n, int k){
        Reverse(arr, 0, k-1);   // first k ele.
        Reverse(arr, k, n-1);   // last n-k ele
        Reverse(arr, 0, n-1);   // Whole Array
    }
    

    // *** Rotate Array k elements to Right...**** 
    public static void RotateeletoRight(int arr[], int n, int k){
        if(n==0)
            return;
        k=k%n;
        if(k>n)
            return;
        int temp[]=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=arr[i];
        }
        // for(int i=n-k-1;i>=0;i--){
        //     arr[i+k]=arr[i];
        // }

        for(int i=0;i<k;i++){
            arr[n-k+i]=arr[i];
        }

        for(int i=0;i<k;i++){
            arr[n-1-i]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }

    // ***** Recursive Approach to Right ***** ...
    public static void RotateRight(int arr[], int n, int k){
        Reverse(arr,0,n-k-1);   // first n-k ele
        Reverse(arr,n-k,n-1);    // last k ele
        Reverse(arr, 0, n-1);   // whole Array
    }

    // 07.. Move Zeros to end of the Array.... 
    public static int[] moveZeros(int n, int []arr) {
        int k=0; // idx for temp
        int temp[]=new int[n];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                temp[n-1-i]=arr[i];         //[0,0]
            }
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                temp[k++]=arr[i];
            }
        }
        // copy temp arr to original array...
        for(int  i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
        int result[]=new int[n];
        for(int i=0;i<arr.length;i++){
            result[i]=arr[i];
        }
        return result;
    }




    // 08. Linear Search ...
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        for(int i=0;i<n;i++){
        if(arr[i]==num)
            return i;
        }
        return -1;
    }


    // Binary Search... 
    public static int binarySearch(int arr[], int key, int si, int ei){
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[mid]<key){       // right
                si=mid+1;
            }
            else if(arr[mid]>key){
                ei=mid-1;           // left
            }
        }
        return -1;
    }



    // Main...... 
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int n = 5;
        int k = 3;
        // Rotateeletoleft(arr, n, k);
        // System.out.print("After Rotating the k elements to left ");

        // Recursive Left...
        // Rotateleft(arr,n, k);



        RotateeletoRight(arr, n, k);
        System.out.print("After Rotating the k elements to right ");

        // Recursive Right...
        // RotateRight(arr, n, k);
        
        for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
        System.out.println();

        // Binary Search...
        int key=5;
        int arr[]={1,2,3,4,5,7,8};
        int n=arr.length;
        System.out.print(binarySearch(arr,key,0,n-1));
    }
}