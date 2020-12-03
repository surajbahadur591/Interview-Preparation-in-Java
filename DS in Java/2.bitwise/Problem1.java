public class Problem1 {

    // check is k-th bit is set or not
    // set means 1
    // n=5, k=1 --> 0101 YES
    // n=2, k=3 --> 10 NO

    static void kthBit(int n, int k) {
        if ((n & (1 << (k - 1))) != 0) {
            System.out.println("yes");
        } else
            System.out.println("no");
    }

    public static void main(String args[]) {
        kthBit(5, 3);
        kthBit(2, 3);
    }

}
