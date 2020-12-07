public class Problem4 {
    // print spiral traversal of matrix

    // 1 2 3 4
    // 5 6 7 8
    // 9 10 11 12
    // 13 14 15 16

    // output - 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

    static void printSpiral(int arr[][]) {
        int top = 0, left = 0, bottom = arr.length - 1, right = arr[1].length - 1;
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }

        }
    }

    static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // int k = 2;
        print(a);
        printSpiral(a);

    }

}
