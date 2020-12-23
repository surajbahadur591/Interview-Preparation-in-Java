import java.util.Arrays;

public class Problem3 {

    // squre of sorted array with negative number
    // Input: [-2, -1, 0, 2, 3]
    // Output: [0, 1, 4, 4, 9]

    public static int[] makeSquare(int arr[]) {

        int leftPointer = 0, rightPointer = arr.length - 1;
        int result[] = new int[arr.length];
        // taking last index becasue right and left will always result in higher value

        int lastIndex = arr.length - 1;

        while (leftPointer < rightPointer) {
            int leftSquare = arr[leftPointer] * arr[leftPointer];
            int rightSquare = arr[rightPointer] * arr[rightPointer];

            if (leftSquare > rightSquare) {
                result[lastIndex] = leftSquare;
                lastIndex--;
                leftPointer++;
            } else {
                result[lastIndex] = rightSquare;
                lastIndex--;
                rightPointer--;
            }
        }

        return result;

    }

    public static void main(String args[]) {

        int arr[] = { -2, -1, 0, 2, 3 };
        int res[] = makeSquare(arr);
        System.out.print(Arrays.toString(res));

    }

}
