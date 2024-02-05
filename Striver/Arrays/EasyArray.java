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

    // 09.. Union of 2 Arrays... (Using Sets) // T.c, S.c= O(m+n)
    // public static List< Integer > sortedArray(int []a, int []b) {
    //     HashSet<Integer>set=new HashSet<>();
    //     ArrayList < Integer > Union=new ArrayList<>();

    //     for(int i=0;i<a.length;i++){
    //         set.add(a[i]);
    //     }
        
    //     for(int j=0;j<b.length;j++){
    //         set.add(b[j]);
    //     }
    //     for (int val: set){
    //         Union.add(val);
    //     }
    //     return Union;
    // }

    // Using Maps   // T.c, S.c= O(m+n)
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        HashMap <Integer,Integer > freq=new HashMap<>();
        ArrayList<Integer> Union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
            
        for (int i = 0; i < m; i++)
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
        for (int it: freq.keySet())
            Union.add(it);
        return Union;
    }

    // Using two-pointers... (gurantee to maintains the sorted order of Result) // T.C.= O(m+N), space- O(1)
    public static List<Integer> sortedArray(int a[], int b[]){
        int n1=a.length;
        int n2=b.length;
        int i=0;
        int j=0;
        ArrayList<Integer> union=new ArrayList<>();
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(union.size()==0 || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        // Left over elements of a[i] Array..
        while(i<n1){
            if(union.size()==0 || union.get(union.size()-1)!=a[i]){
                union.add(a[i]);
            }
            i++;
        }
        // Left over elements of b[j] Array..
        while(j<n2){
            if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                union.add(b[j]);
            }
            j++;
        }
        return union;
    }   

    // ***  Check if 2 arrays are equal or not... 
    static boolean check(int N, long[] A, long[] B) {
        // Create HashMaps to store the frequency of elements in both arrays
        Map<Long, Integer> freqA = new HashMap<>();
        Map<Long, Integer> freqB = new HashMap<>();

        // Count the frequency of elements in array A
        for (long num : A) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

        // Count the frequency of elements in array B
        for (long num : B) {
            freqB.put(num, freqB.getOrDefault(num, 0) + 1);
        }

        // Check if the frequencies of elements are the same in both arrays
        return freqA.equals(freqB);
    }

    // 'or' .....
     public static boolean check(long A[],long B[],int N)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        if(Arrays.equals(A,B)){
            return true;
        }
        return false;
        
    }
    // Spiral Matrix Code....
    public static void printSpiral(int Matrix[][]) {
        int startRow = 0;
        int endRow = Matrix.length - 1;
        int startCol = 0;
        int endCol = Matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(Matrix[startRow][j] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(Matrix[i][endCol] + " ");
            }
            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(Matrix[endRow][j] + " ");
            }
            // Left
            for (int i = endRow - 1; i >= startRow+1; i--) {
                System.out.print(Matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }


    // ques- 11 Find Consecutive ones in Array...
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0; int temp=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                // temp++;
            }
            else{
                // count=temp-count;     // 0
                count=0;
            }
            temp=Math.max(temp,count);
        }
        return temp;                    // return count;
    }


    // Ques- 12 Find No. that appears once in the Array...
    public static int getSingleElement(int []arr){
        Write your code here.
        int result=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
                result=arr[i];
            }
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                result=entry.getKey();
                break;
            }
        }
        return result;

        // 'or' ....
        int r=0;
        for(int i=0;i<arr.length;i++){
            r= r^arr[i];
        }
        return r;




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

        // Union 2- pointer..
        int a[]={1,3,5};
        int b[]={1,2,4,5,6};
        List<Integer> result = sortedArray(a, b);
        System.out.println("Union of the sorted arrays: " + result);

        // 2 Arrays are equal or not...
        int N1 = 5;
        long[] A1 = {1, 2, 5, 4, 0};
        long[] B1 = {2, 4, 5, 0, 1};
        boolean output1 = check(N1, A1, B1);
        System.out.println(output1);  

        
        int Matrix[][] = { { 1, 2, 3, 4 }, 
                           { 5, 6, 7, 8 }, 
                           { 9, 10, 11, 12 }, 
                           { 13, 14, 15, 16 } };
        printSpiral(Matrix);

    }   
}