import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
public class Hashing_Ques {

    // 01. Find all the elements that appears more than [n/3] times in Array....
    // nums[]={1,3,2,5,1,3,1,5,1}, 

    public static void majorityElement(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key)>n/3){               // n/3= 9/3=3.
                System.out.println(key);
            }
        }
    }


    // 02. count Frequency of each element in the array..... 
    public static void CountFreq(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        // Traversing..
        for(Map.Entry<Integer,Integer>e: map.entrySet()){
            System.out.println(e.getKey()+ " "+ e.getValue());
        }
    }


    // 03. Find the highest/lowest Frequency Element...
    static void Frequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        int maxEle = 0, minEle = 0;
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq || (count == maxFreq && element < maxEle)) {
                maxFreq = count;
                maxEle = element;
            }

            if (count < minFreq || (count == minFreq && element < minEle)) {
                minFreq = count;
                minEle = element;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }


    // 04. find the Union of 2 Arrays....
    public static int union(int arr1[],int arr2[]){         // O(n)
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }


    // 05. InterSection of 2 Arrays....
    public static int interSection(int arr1[], int arr2[]){
        HashSet<Integer> set =new HashSet<>();
        int count=0;

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }


    // 06. Find Itinerary (journey path) from tickets...
    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revMap =new HashMap<>();

        // key-> key, value -> tick.get(key)  Original Map
        for(String key : tick.keySet()){
            revMap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }

    // 07. Frequency of the most Frequent Element.... 
    // leet code ... input;- [1,2,4]  ouput- 3, increment 1,2 by 3 and 2 so [4,4,4]... 

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int maxFreq = 0;
        long currentSum = 0;

        for (int right = 0; right < n; right++) {
            currentSum += nums[right];

            while ((right - left + 1) * (long) nums[right] - currentSum > k) {
                currentSum -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }







    // Main....
     public static void main(String args[]){
        int nums[]={1,3,2,5,1,3,1,5,1};              // 1- 4, 2- 1, 3- 2, 5- 2     key- frequency
        

        
        //01. all elements > than n/3
        // majorityElement(nums);                      // 4>3 so 1 is answer...


        //02. Count of freq...
        // CountFreq(nums);                                // 1- 4, 2- 1, 3- 2, 5- 2         key- frequency


        // 03. Highest/lowest frequency..
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        // Frequency(arr, n);


        
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        //04. Union of 2 arrays..
        // System.out.println(union(arr1,arr2));                // 6

        // 05. Intersection of arrays..
        System.out.println(interSection(arr1,arr2));           // 2


        //06. Itinerary from tickets...
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start+ "->");
            start=tickets.get(start);
        }
        System.out.println(start);


        // 07. Freq of most freq. element..
        int[] nums1 = {1, 2, 4};
        int k1 = 5;
        System.out.println(maxFrequency(nums1, k1));  // Output: 3

        int[] nums2 = {1, 4, 8, 13};
        int k2 = 5;
        System.out.println(maxFrequency(nums2, k2));  // Output: 2

        int[] nums3 = {3, 9, 6};
        int k3 = 2;
        System.out.println(maxFrequency(nums3, k3));  // Output: 1
        

    
    
    
    
    
    
    
    }
}
