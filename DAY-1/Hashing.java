import java.util.*;
// Hashing in JAVA....
public class Hashing{
    public static void main(String args[]){
        // country(key), population(value)
        HashMap<String,Integer>map= new HashMap<>();

        // Insertion.....
        map.put("china",120);
        map.put("India", 30);
        map.put("US", 20);


        // Searching...
        if(map.containsKey("china")){
            System.out.println("It is Present");
        }
        else{
            System.out.println("Not present");
        }

        // Get (Retrieve)
        System.out.println(map.get("china"));

        // Iteration...
        int arr[]={12,25,14};

        // for(int i=0;i<3;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // for(int val : arr){
        //     System.out.print(val +" ");
        // }

        // Iteration in Hashing... 
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // 2nd Method for Keys...
        // Set<String> Keys= map.keySet();
        // for(String key:Keys){
        //     System.out.println(key+" "+map.get(key));
        // }


        // Deletion in Hashing...
        map.remove("china");
        System.out.println(map.get("china"));    // null



    }
}