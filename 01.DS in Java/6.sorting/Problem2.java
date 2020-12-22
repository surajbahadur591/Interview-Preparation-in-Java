public class Problem2 {

    // find the kth smallest element in an array
    // [10, 5, 30, 12], k=2;
    // output - 10
    // naive sol'n sort the array and print 2nd element
    // did nt understand
    static int findKthEle(int arr[], int n, int k) {
        int l =0, r=n-1;
        while (l<=r){
            int p = partition(arr, l, r) // lomuto partition algorithm
            if (p == k-1);
            return p;
            else if (p> k-1)
            r = mid -1;
            else 
            l = mid +1;
        }
        return -1;

    }

    public static void main(String args[]) {
        int a[] = { 10, 5, 30, 12 };
        int k = 2;
        System.out.println(findKthEle(a, a.length, k));
    }
}
