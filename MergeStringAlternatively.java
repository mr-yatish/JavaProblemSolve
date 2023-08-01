import java.util.Scanner;

public class MergeStringAlternatively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String result = "";
        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if (i < s1.length()) {
                result += s1.charAt(i);
            }
            if (i < s2.length()) {
                result += s2.charAt(i);
            }
        }
        System.out.println(result);
    }
}
