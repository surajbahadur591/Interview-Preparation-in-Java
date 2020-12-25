public class Problem2 {

    // count set bits of a number in its binary representation, set means 1

    // naive solution
    static int countSetBits(int n) {
        int res = 0;
        while (n > 0) {
            
            if (n % 2 != 0) // if((n&1)==1)
                res++; // res+=1
            n = n / 2; // n=n>>1
        }

        return res;

    }

    // Brian and Kerningham Algorithm - used to count set bit
    static int countSetBits2(int n) {
        int res = 0;
        while (n > 0) {
            n = (n & (n - 1));
            res++;
        }

        return res;
    }

    public static void main(String args[]) {

        System.out.println(countSetBits(15));
        System.out.println(countSetBits2(40));

    }

}
