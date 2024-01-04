// // DataType...
import java.util.*;
public class ConceptsOfJava {
    
    // public static void main(String[] args) {
    //     // Write your code here
    //     Scanner sc = new Scanner(System.in);
    //     char c= sc.next().charAt(0);
    //     // char c;

    //     if((c>='A')&&(c<='Z')){
    //         System.out.print("1");
    //     }
    //     else if((c>='a')&&(c<='z')){
    //         System.out.print("0");
    //     }
    //     else{
    //         System.out.print("-1");
    //     }
    // }

    public static String compareIfElse(int a, int b) {
        if(a>b){
            System.out.print("Greater");
            return "Greater";
        }
        else if(a==b){
            System.out.print("Equal");
            return "Equal";
        }
        else{
            System.out.print("Smaller");
            return "Smaller";
        }
        
    }
    public static void main(String args[]){
        compareIfElse(5,3);
    }
    
}

