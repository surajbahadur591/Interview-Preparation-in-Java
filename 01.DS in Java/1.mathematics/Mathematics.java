import java.lang.*;

import java.util.*;


public class Mathematics {

    // recursive solution to count digit of a number
    static int countDigit(long n) {
        if (n == 0)
            return 0;
        return 1 + countDigit(n / 10);
    }

    // finding absolute value
    static int absoluteValue(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {
        System.out.println("Digits of 8585");
        System.out.println(countDigit(8585));
        System.out.println("Absolute value of -855");
        System.out.println(absoluteValue(-855));

    }
}
