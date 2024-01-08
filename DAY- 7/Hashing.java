import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Hashing{
    public static int[] nFrequency(int n, int x, int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        int result[]= new int[n];       // new created same size as of input..
        for(int i=1;i<=n;i++){          // bcoz array should be 1 to 'n'...
            result[i - 1 ]=map.getOrDefault(i,0);
        }
        return result;
        
    }






    public static void main(String args[]){
        int n=6; int x=9;
        int nums[]={1,3,1,9,2,7};
        int frequencies[]= nFrequency(n,x,nums);
        System.out.println("Frequencies array: " + Arrays.toString(frequencies));
        
    }
}