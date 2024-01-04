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


    //02. If else 
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

    // Switch Case.....
    public static int dataTypes(String type) {
        switch(type){
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            case "Character":
                return 1;
        }
        return 0;
    }

    // Switch Question...
     public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        switch(ch){
            case 1:
                return 3.14 * a[0] * a[0];
            case 2:
                return a[0] * a[1];
        }
        return 0;
    }





    // Main...... 
    public static void main(String args[]){

        // If else.
        // compareIfElse(5,3);


        // switch... 
        double a[]={3,2};
        int ch=1;
        double result=areaSwitchCase(ch, a);
        System.out.print(result);
    }
    
}

