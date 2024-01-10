public class Basicmath{
    // GCD of 2 numbers..
    public static int calcGCD(int n, int m){
        int ans=1;
        for(int i=1;i<=Math.min(n,m);i++){
            if(n%i==0 && m%i==0){
                ans=i;
            }
            
        }
        System.out.println();
        return ans;
    }

    














}
