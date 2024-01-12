public class IncNum{
public static void printName(int i, int n){
        if(i>n){
            return;
        }
        System.out.print("Dhruv" + " ");
        printName(i+1, n);
}

public static void printInc(int i, int n){
    if(i>n){
        return;
    }
    System.out.print(n + " ");
    printInc(n-1);
}
    
    public static void main(String args[]){
        int n=5;
        // printName(1,n);

        // Decreasing order..
        printInc(n);

    }

} 
