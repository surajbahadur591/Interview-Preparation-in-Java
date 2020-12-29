public class Problem3 {

    // sort an array with two types of element
    // seperate _ve and +ve
    // seperate even and odd
    // seperate binary numbers

    // use Hoare’s partition algorithm

    static void Sorttt(int arr[], int n) {

        int i =-1, j = n;
        while (true){
            do { i++;}
            while(arr[i]<0);
            do { j--}
            while (arr[j]>=0)
            if (i>=j)
            return;
            swap(arr[i], arr[j]);
        }

    }

    public static void main(String args[]) {
        int a[] = { -12, 10, -10, 15 };
        // int k = 2;
        Sorttt(a, a.length);
    }

    
}
