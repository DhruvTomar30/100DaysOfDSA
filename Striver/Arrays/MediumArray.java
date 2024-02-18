public class Solution{

    // 01..  2 Sum Code 
    // Brute Approach.. O(n^2)
    public static String read(int n, int []arr, int target){
        // Write your code here.
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) return "YES";
            }
        }
        return "NO";
    
        // Better Approach.. O(n)
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=arr[i];
            int rem=target-num;
            if(map.containsKey(rem)){
                return "YES";
            }
            map.put(arr[i],i);
        }
        return "NO";

        // Optimal Approach.. (O(N)+ O(N* logn))
        Arrays.sort(arr);
        int left=0, right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return "YeS";
            }
            else if(sum<target) left++;
            else right--;
        }
        return "NO";
    }


    // 02..   Sort An Array of 0s, 1s and 2s ..

    // Better O(N)+O(N)... 
     public static void sortArray(ArrayList<Integer> arr, int n) {
        int cnt0=0, cnt1=0, cnt2=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==0) cnt0++;
            else if(arr.get(i)==1) cnt1++;
            else cnt2++;
        }
        for(int i=0;i<cnt0; i++) arr.set(i,0);
        for(int i=cnt0;i<cnt0+ cnt1; i++) arr.set(i,1);
        for(int i=cnt0 + cnt1+ cnt2; i<n; i++) arr.set(i,2);

    // Optimal Approach O(n).....
    int low = 0, mid = 0, high = n - 1; // 3 pointers
        while (mid <= high) {
            if (arr.get(mid) == 0) {
                // swapping arr[low] and arr[mid]
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);

                low++;
                mid++;

            } else if (arr.get(mid) == 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;
            }
        }
    }

    // 03... Majority Element (>n/2 times)..
    // Brute Approach.. O(N^2)
    public static int majorityElement(int []v) {
        int n=v.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(v[j]==v[i]){
                    cnt++;
                }
            }
            if(cnt>(n/2)){
                return v[i];
            }
        }
        return -1;

        // Better Approach- HashMap- O(N * logn) + O(N)
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int value=map.getOrDefault(v[i],0);
            map.put(v[i],value +1);
        }
        // searching for majority element..
        for(Map.Entry<Integer,Integer>entry: new entrySet()){
            if(entry.getValue() > (n/2)){
                return entry.getKey();
            }
        }
        return -1;

        // optimal...  Moore's Voting Algorithm...
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }
        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }

    // 04.. // I-  Find Sum of SubArrays and Print Max Sum....
    // I- Brute Force..    O(n^3)... 
    public static void printSumofSubArrays(int nums[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=1;j<nums.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    currSum+=nums[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum is:"+ maxSum);
    }

     // II- Prefix Sum   O(n^2)... 
    public static void printSumofSubArrays(int nums[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int Prefix[]=new int[nums.length];

        prefix[0]=nums[0];
        for(int i=1; i<prefix.length;i++){
            // calculate array prefix..
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;i++){
                int end =j;

                currSum=start == 0 ? prefix[end] : prefix[end] - prefix[start -1];
                if(maxSum < currSum){
                    maxsum =currSum;
                }
            }
        }
        System.out.println("max sum is:"+ maxSum);
    } 

     // III. KADAN'S Algorithm         
    // O(n)... Optimal Approach..
    public static void printSumofSubArrays(int nums[]){
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            currSum += nums[i];
            if(currSum < 0){
                currSum=0;
            }
            maxSum= Math.max(currSum, maxSum);
        }
        System.out.println("max sum is:"+ maxSum);
    }


    // 06.. Buy and Sell Stock... 
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){ //profit
                int profit=prices[i]-buyPrice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxprofit;
    }



    // 07. Rearranging the array in alternating +ve and -ve signs..

    // Brute Approach... O(N + N/2)..
    public static int[] RearrangebySign(int[] A, int n){
    
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        
        // Segregate the array into positives and negatives.
        for(int i=0;i<n;i++){
            
            if(A[i]>0) pos.add(A[i]);
            else neg.add(A[i]);
        }
        
        // Positives on even indices, negatives on odd.
        for(int i=0;i<n/2;i++){
            
            A[2*i] = pos.get(i);
            A[2*i+1] = neg.get(i);
        }

        
        return A;
    }   

    // Optimal Approach ... O(n)
    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
        // Define 2 ArrayLists, one for storing positive 
        // and other for negative elements of the array.
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Segregate the array into positives and negatives.
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0)
                pos.add(A.get(i));
            else
                neg.add(A.get(i));
        }

        // If positives are lesser than the negatives.
        if (pos.size() < neg.size()) {

            // First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining negatives at the end of the array.
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }

        // If negatives are lesser than the positives.
        else {
            // First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining positives at the end of the array.
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }

    // 08. Next Permutation....
    

    // 09. Superior Element (Leaders in Array)...
    public static List< Integer > superiorElements(int []arr) {
        // Write your code here.
                // printLeadersBruteForce(int[] arr, int n){
                    int n=arr.length;
    
        ArrayList<Integer> ans= new ArrayList<>();
        
        // Last element of an array is always a leader,
        // push into ans array.
        int max = arr[n - 1];

            ans.add(arr[n-1]);
            
            // Start checking from the end whether a number is greater
            // than max no. from right, hence leader.
            for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }

        return ans;
    }

     // 10. Longest Consecutive Sequence 
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Arrays.sort(a);
        int n=a.length;
        int cnt=1;
        int maxcnt=1;
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]+1){
                cnt++;
                maxcnt=Math.max(maxcnt,cnt);
            }
            else if (a[i] != a[i - 1]){
                cnt=1;
            }
        }
        return maxcnt;
    }
    // 11. Zero Matrix...
    // Better Approach .. O(2*(N*M))
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        int[] row = new int[n]; // row array
        int[] col = new int[m]; // col array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    // mark ith index of row wih 1:
                    row[i] = 1;

                    // mark jth index of col wih 1:
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }




    // Main .... 
    public static void main(String args[]){
        
        //01. 2 sum 
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);

        // 02. code 
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // 03.. Majority element..
         int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
}