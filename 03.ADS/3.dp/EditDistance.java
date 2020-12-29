public class EditDistance {

    // convert string 1 to string 2 with minimum operation
    // insert, delete, swap operations

    // solving using recursion (dp)
    // n, m are stating position
    public static int editDistance(String str1, String str2, int m, int n) {

        // if any one string is greater than another
        if (str1.length() == m) {
            return str2.length() - n;
        }

        if (str2.length() == n) {
            return str1.length() - m;
        }

        // if character matches
        if (str1.charAt(m) == str2.charAt(n)) {
            editDistance(str1, str2, m + 1, n + 1);
        }

        return Math.min(Math.min(editDistance(str1, str2, m + 1, n) + 1, editDistance(str1, str2, m + 1, n + 1) + 1),
                editDistance(str1, str2, m, n + 1) + 1);

    }

    public static void main(String args[]) {

        System.out.print(editDistance("SUNDAY", "SATURDAY", 0, 0));
    }

}
