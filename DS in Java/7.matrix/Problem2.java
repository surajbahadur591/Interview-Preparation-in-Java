public class Problem2 {

    // transpose of a matrix
    // rows become column and column becomes rows

    static void transpose(int arr[][]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

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
        transpose(a);
        print(a);
    }

}
