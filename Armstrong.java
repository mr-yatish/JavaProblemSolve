public class Armstrong {
    public static void main(String[] args) {
        // int num = 153;
        // int num2 = num;
        for (int j = 1; j < 100; j++) {
            int length = 0;
            int num1 = j;
            while (j != 0) {
                j = j / 10;
                length++;
            }
            int total = 0;
            int num2=j;
            while (num2 != 0) {
                int a = num2 % 10;
                int multi = 1;
                for (int i = 0; i < length; i++) {
                    multi = multi * a;
                }
                total += multi;
                num2 = num2 / 10;
            }
            if (total == j) {
                System.out.println("Armstrong Num:- " + j);
            } 

        }
    }
}
