public class Problem5 {

    // Comparing Strings containing Backspaces (medium)

    // Input: str1="xy#z", str2="xzz#"
    // Output: true
    // Explanation: After applying backspaces the strings become "xz" and "xz"
    // respectively.

    // for getting valid index after removing backspace from right to left
    public static int getValidIndex(String s1, int index) {
        int backspaceCount = 0;
        int i = index;

        while (i > 0) {
            if (s1.charAt(i) == '#')
                backspaceCount++;
            else
                break;
            i--;
        }
        while (backspaceCount > 0) {
            i--;
            backspaceCount--;
        }
        return i;

    }

    public static boolean compare(String str1, String str2) {
        int index1 = str1.length() - 1, index2 = str2.length() - 1;

        while (index1 >= 0 || index2 >= 0) {
            int i1 = getValidIndex(str1, index1);
            int i2 = getValidIndex(str2, index2);

            // if character does not match

            if (str1.charAt(i1) != str2.charAt(i2))
                return false;

            // if both string contain same length
            if (i1 < 0 && i2 < 0)
                return true;

            // if string are not same length
            if (i1 < 0 || i2 < 0)
                return false;

            index1 = i1 - 1;
            index2 = i2 - 1;
        }
        return true;

    }

    public static void main(String args[]) {

        System.out.println(compare("xy#z", "xyz#"));
        System.out.println(compare("xy#z", "xzz#"));
        // System.out.print(getValidIndex("xyzz##", 5));

    }

}
