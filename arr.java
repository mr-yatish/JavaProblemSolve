import java.util.Arrays;

/**
 * arr
 */
public class arr {

    public static void main(String[] args) {
        int arr[]={3400,67,90,80,1,450,10,100,400,501,10001};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            temp=temp%10;
            if (temp==0) {
                int temp1=arr[i];
                arr[i]=arr[count];
                arr[count]=temp1;
                // arr[count]=arr[i];
                count++;
            }
        }
        int arr1[]=new int[count];
        int arr2[]=new int[arr.length-count];
        for (int i = 0; i < count; i++) {
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        int a=0;
        for (int i = arr1.length; i < arr.length; i++) {
            arr2[a]=arr[i];
            a++;
        }
        a=0;
        Arrays.sort(arr2);
        for (int i = 0; i < arr.length; i++) {
            if (i<count) {
                arr[i]=arr1[i];
            }else if (i>=count) {
                arr[i]=arr2[a];
                a++;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
       
    }
}