public class Problem2 {

    // Happy Number (medium)

    // sum of the square of all of its digits, leads us to number ‘1’.
    // Input: 23
    // Output: true (23 is a happy number)

    public static boolean find(int num) {
        int slow = num, fast = num;
        do {
            slow = findSquareSum(slow); // move one step
            fast = findSquareSum(findSquareSum(fast)); // move two steps
        } while (slow != fast); // found the cycle

        return slow == 1; // see if the cycle is stuck on the number '1'
    }

    private static int findSquareSum(int num) {
        int sum = 0, digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(find(23));
        System.out.println(find(12));
    }
}
