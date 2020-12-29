public class Problem3 {

    // rotate matrix by 90 degree anticlock wise
    // 1 2 3 4
    // 5 6 7 8
    // 9 10 11 12
    // 13 14 15 16

    // output -
    // 4 8 12 16
    // 3 7 11 15
    // 2 6 10 14
    // 1 5 9 13

    // do transpose then reverse each column

    static void rotate(int arr[][]) {
        // transpose
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }

        }
        // reverse column
        for (int i = 0; i < arr.length; i++) {
            int low = 0, high = arr.length - 1;
            while (low < high) {
                temp = arr[low][i];
                arr[low][i] = arr[high][i];
                
                arr[high][i] = temp;
                low++;
                high--;
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
        rotate(a);
        print(a);
    }
}
