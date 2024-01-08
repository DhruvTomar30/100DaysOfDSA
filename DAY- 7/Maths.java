public class Maths{
    // Count of number divisible by its digits....
    public static int countDigits(int n) {
        int count = 0;
        int x = n;
        while (x > 0) {
            int last_digit = x % 10;
            if (last_digit != 0 && n % last_digit == 0) {
                count++;
            }
            x = x / 10;
        }
        return count;
    }

    // Count of number divisible by its digits....
    public static int countDigits(int n) {
        int count = 0;
        int x = n;
        while (x > 0) {
            int last_digit = x % 10;
            if (last_digit != 0 && n % last_digit == 0) {
                count++;
            }
            x = x / 10;
        }
        return count;
    }


    public static void main(String args[]){
        int n=35;                           // 35- as 35 is only divisible by 5 not 3 so count is 1.
        System.out.print(countDigits(n));   //1
    }
}