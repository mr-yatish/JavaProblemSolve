import java.util.Arrays;

public class MissingArr {
    static int missingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        int firstMissing = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (count > n - 1) {
                firstMissing = count;
                break;
            }
            if (count != array[i]) {
                firstMissing = count;
                break;
            } else {
                count++;
            }
        }
        return firstMissing;
    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        int n = arr.length + 1;
        int miss = missingNumber(arr, n);
        System.out.println(miss);
    }
}
