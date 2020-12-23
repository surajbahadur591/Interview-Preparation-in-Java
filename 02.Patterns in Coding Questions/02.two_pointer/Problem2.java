
public class Problem2 {

    // Given an array of sorted numbers, remove all duplicates from it
    // Input: [2, 3, 3, 3, 6, 9, 9]
    // Output: 4

    public static int removeDuplicate(int arr[]) {
        int nonRepeating = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[nonRepeating - 1]) {
                arr[nonRepeating] = arr[i];
                nonRepeating++;
            }
        }
        return nonRepeating;

    }

    public static void main(String args[]) {

        int arr[] = { 2, 3, 3, 3, 6, 9, 9 };
        System.out.print(removeDuplicate(arr));

    }

}
