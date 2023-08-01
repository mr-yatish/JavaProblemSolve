public class fibonaciS {
    public static void main(String[] args) {
        int count=0;
        int count1=1;
        int count2=0;
        for (int i = 0; i < 10; i++) {
            System.out.println(count);
            count=count1;
            if (i==2) {
                count2=1;
            }
            count1+=count2;
            count2++;
        }
    }
}
