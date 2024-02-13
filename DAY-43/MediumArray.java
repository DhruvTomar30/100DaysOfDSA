public class Solution{

    // 01..  2 Sum Code 
    public static String read(int n, int []arr, int target){
        // Write your code here.
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) return "YES";
            }
        }
        return "NO";
    }

    

    // 02..   Sort An Array of 0s, 1s and 2s ..
     public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
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
    public static int majorityElement(int []v) {
        // Write your code here
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

    // 04.. Kadan's Algorithm ..... 
     public static int maxSubarraySum(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE; // maximum sum


        // Brute Force... 
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;

                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }   

// I-  Find Sum of SubArrays and Print Max Sum....
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


    // 06. Buy and Sell Stock....
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

        // Sum of SubArrays and print max sum.....
        int nums[]={2,4,6,8,10};
        printSumofSubArrays(numbers);

    }
}