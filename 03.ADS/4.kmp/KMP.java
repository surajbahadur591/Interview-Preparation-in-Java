public class KMP {

    public static int[] getlps(String pattern) {
        int len = pattern.length();
        int lps[] = new int[len];

        lps[0] = 0;
        int i = 0;
        int j = 0;

        while (i < len) {
            // System.out.print("2");
            if (pattern.charAt(i) == pattern.charAt(j)) {
                lps[i] = j + 1;
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }

            }

        }

        return lps;
    }

    public static boolean kmpSearch(String text, String pattern) {
        int txtLen = text.length();
        int patLen = pattern.length();

        int i = 0, j = 0;

        int lps[] = getlps(pattern);
        while (i < txtLen && j < patLen) {
            // System.out.println("1");
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j != 0) {
                j = lps[j - 1];
            } else {
                i++;
            }

        }
        if (j == patLen)
            return true;

        return false;
    }

    public static void main(String args[]) {

        System.out.println(kmpSearch("abcxabcdabcdabcy", "abcdabcy"));

    }

}
