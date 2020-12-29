public class Problem5 {

    // seach for element in sorted martrix row and column wise
    // 12 20 30 40
    // 15 25 26 45
    // 18 29 37 39
    // 32 33 39 50

    // k = 29
    // output - 1 3
    static void search(int arr[][], int k) {
        int i = 0, j = arr[1].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == k) {
                System.out.print(i + " " + j);
                return;
            } else if (arr[i][j] > k)
                j--;
            else
                i++;
        }
        System.out.print("not found");

    }

    public static void main(String args[]) {
        int a[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int k = 39;

        search(a, k);

    }

    
}
