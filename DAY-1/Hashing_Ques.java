import java.util.HashMap;
import java.util.Map;
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

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
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
        Frequency(arr, n);
    
    
    
    
    
    
    
    }
}
