public class Problem6 {

    // generate powerset
    
    // s=abc
    // output : "", a, b, c, ab, ac, bc, abc | order can be different
    // 0 to (2^n - 1)

    // example
    // 0 00 ""
    // 1 01 "a"
    // 2 10 "b"
    // 3 11 "ab"

    static void printPowerset(String str) {

        int n = str.length();
        double powSize = Math.pow(2, n);

        for (int counter = 0; counter < powSize; counter++) {
            for (int j = 0; j < n; j++) {
                if ((counter & (1 << j)) != 0)
                    System.out.print(str.charAt(j));
            }

            System.out.println();
        }

    }

    public static void main(String args[]) {
        String str = "abc";
        printPowerset(str);

    }

}
