public class Problem3 {

    // check if a number is power of 2 or not
    // n=4 , TRUE
    // n=6, false
    static boolean powOf2(int n) {

        // power of 2 have only 1 bit set so use brian and Kerningham Algorithm
        // if set is one then it is power of 2
        if (n == 0)
            return false;

        return ((n & (n - 1)) == 0);

    }

    public static void main(String args[]) {

        System.out.println(powOf2(32));
        System.out.println(powOf2(40));

    }

}
