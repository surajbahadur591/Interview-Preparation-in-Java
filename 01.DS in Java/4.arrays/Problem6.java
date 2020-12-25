public class Problem6 {
    // trapping rain water \ measure how much water you can contain
    // another famous interview problem
    // [2,0,3]
    // output = 2
    // int a[] = { 1, 2, 3 };
    // int n = 3;

    // cannot store water at leftmost and rightmost end, water can be stored in
    // middle

    // find left max and right max and find how much water can be stored at a
    // particular element

    static int getWater(int arr[], int n) {
        int res = 0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = arr[0];
        rmax[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++)
            
            lmax[i] = Math.max(arr[i], lmax[i - 1]);

        // for (int i = 0; i < lmax.length; i++) // length is the property of the array
        // System.out.print(lmax[i] + " ");

        for (int j = n - 2; j >= 0; j--)
            rmax[j] = Math.max(arr[j], rmax[j + 1]);

        // for (int i = 0; i < rmax.length; i++) // length is the property of the array
        // System.out.print(rmax[i] + " ");

        for (int i = 1; i < n - 1; i++) {
            res = res + (Math.min(lmax[i], rmax[i]) - arr[i]);
        }

        return res;
    }

    public static void main(String args[]) {
        int a[] = { 5, 0, 6, 2, 3 };
        int n = 5;

        System.out.println(getWater(a, n));

    }
}
