/**
 * Sorting
 */
public class Sorting {

    public static int[] sort012(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = { 0, 2, 1, 2, 0 };
        int n=a.length;
        a=sort012(a, n);
        for (int i : a) {
            System.out.println(i);
        }
    }
}