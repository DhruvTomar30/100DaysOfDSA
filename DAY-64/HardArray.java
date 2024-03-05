public class Main{

    // 01.. Pascal's Triangle..... (variant 1)....
    // Brute Approach...    O(n^2)
     public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new ArrayList();
        List<List<Integer>> result=new ArrayList();
        for(int i=1;i<=numRows;i++){    // for rows (5)..
            List<Integer> row= new ArrayList();     // ----> 1,2,3,4,5
            for(int j=0; j<i;j++){          // row index..
                if(j==0 || j==i-1) {
                    row.add(1);
                }
                else{
                    row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));       //1   --0+1     //2    --1+2
                }
            }
            result.add(row);
        }
        return result;
    }


    // optimal Approaches variant 1....
    public static long nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    public static int pascalTriangle(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    // Variant 2.... 
    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    public static void pascalTriangle(int n) {
        // printing the entire row n:
        for (int c = 1; c <= n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        System.out.println();
    }


    // 02.  Majority Element (n/3)....
     // Brute Approach..
    public List<Integer> majorityElement(int[] nums) {
     List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]){
                    cnt++;
                }
            }
             if (cnt > n / 3 && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    // Better Approach...
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int value=map.getOrDefault(nums[i],0);
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        // searching.
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            // int ans=new int[n];
            if(entry.getValue()>n/3){
               ans.add(entry.getKey());
            }
        }
        return ans;
    }
    
    // Optimal Approach... (Extended Boyer Moore's Voting algo)..
    public static List<Integer> majorityElement(int []v) {
        int n = v.length; //size of the array
        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2
        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != v[i]) {
                cnt1 = 1;
                el1 = v[i];
            } else if (cnt2 == 0 && el1 != v[i]) {
                cnt2 = 1;
                el2 = v[i];
            } else if (v[i] == el1) cnt1++;
            else if (v[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }
        List<Integer> ls = new ArrayList<>(); 
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1) cnt1++;
            if (v[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        return ls;
    }


    // Ques-03   3 Sum code... 
    // Better Approach.... 
    public static List< List < Integer > > triplet(int n, int []arr) {
       
         Set<List<Integer>> st = new HashSet<>();

        // check all possible triplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        return st;
    }

    // Optimal code.. 
        public static List< List < Integer > > triplet(int n, int []arr) {
        List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(arr);
            for(int i=0; i<n;i++){
                if(i!=0 && arr[i]==arr[i-1]) continue;
                // moving 2 pointers
                int j=i+1;
                int k=n-1;
                while(j<k){
                    int sum=arr[i]+arr[j]+arr[k];
                    if(sum<0) j++;
                    else if(sum>0) k--;
                    else{
                        List<Integer> temp =Arrays.asList(arr[i],arr[j],arr[k]);
                        ans.add(temp);
                        j++;
                        k--;
                        // skip duplicates
                        while(j<k && arr[j]==arr[j-1]) j++;
                        while(j<k && arr[k]==arr[k-1]) k--;
                    }
                }
            }
        return ans;
    }



    // 04. Sum Code...
      public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        List<List<Integer>> ans = new ArrayList<>();

        // sort the given array:
        Arrays.sort(nums);

        // calculating the quadruplets:
        for (int i = 0; i < n; i++) {
            // avoid the duplicates while moving i:
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n; j++) {
                // avoid the duplicates while moving j:
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // 2 pointers:
                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;

                        // skip the duplicates:
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    } else if (sum < target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }

    // Optimal Code... 
    public static List<List<Integer>> triplet(int n, int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            //remove duplicates:
            if (i != 0 && arr[i] == arr[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        return ans;
    }


    //
     public static int subarraysWithXorK(int []a, int k) {
        int n = a.length; //size of the given array.
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
        mpp.put(xr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ a[i];

            //By formula: x = xr^k:
            int x = xr ^ k;

            // add the occurrence of xr^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    }


    // Main.....
    public static void main(String[] args) {

        // 01. Pascal's Triangle..
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);

        // Variant 2..
        pascalTriangle(n);
    }
}