
public class Check {
    private static String NumberValidation(String number) {
        if (number != null && number.length() == 10) {
            for (char c : number.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return c + " This is Not a Number";
                }
            }
            return "";
        } else if (number == null) {
            return "Please Enter The Number";
        } else if (number.length() < 10) {
            return "Number Is Less Than 10 Digits";
        } else{
            return "Number Is More Than 10 Digits";
        }
    }
    public static void main(String[] args) {
        System.out.println(NumberValidation("123445678"));
    }
}
