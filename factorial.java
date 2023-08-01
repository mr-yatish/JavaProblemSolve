public class factorial {
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i < 10; i++) {
            count+=count*i;
            System.out.println(count);
        }
    }
}
