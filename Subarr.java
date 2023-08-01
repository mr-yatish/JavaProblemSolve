import java.util.ArrayList;

/**
 * Subarr
 */
public class Subarr {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> arrli = new ArrayList<>();
        boolean b = false;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (sum>s) {
                    break;
                }
                if (sum != s) {
                    sum += arr[j];
                }
                if (sum == s) {
                    arrli.add(0, i+1);
                    arrli.add(1, j+1);
                    b = true;
                    break;
                } 
            }
            if (b) {
                break;
            }
        }
        if (b==false) {
            arrli.add(0, -1);
        }

        return arrli;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        // int[] arr = {142, 112, 54, 69, 148, 45, 63, 158, 38, 60, 124, 142, 130, 179, 117, 36, 191, 43, 89, 107, 41, 143, 65, 49, 47, 6, 91, 130, 171, 151, 7, 102, 194, 149, 30, 24, 85, 155, 157, 41, 167, 177, 132, 109, 145, 40, 27, 124, 138, 139, 119, 83, 130, 142, 34, 116, 40, 59, 105, 131, 178, 107, 74, 187, 22, 146, 125, 73, 71, 30, 178, 174, 98, 113};
        int n = arr.length;
        int s = 12;
       ArrayList<Integer> arrli= subarraySum(arr, n, s);
       if (arrli.size()==1) {
        
              System.out.println(arrli.get(0));
            }else{

                System.out.println(arrli.get(0)+" To "+arrli.get(1));
            }
    }
}