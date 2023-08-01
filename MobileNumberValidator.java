public class MobileNumberValidator {

    public static String validateMobileNumber(String number) {
        // Check if the number is not null and exactly 10 digits long
        if (number != null && number.length() == 10) {
            // Check if the number contains only digits
            for (char c : number.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return "Invalid: The number contains non-digit characters.";
                }
            }
            return "Valid: The number is valid.";
        } else if (number == null) {
            return "Invalid: The number is null.";
        } else if (number.length() < 10) {
            return "Invalid: The number is too short.";
        } else {
            return "Invalid: The number is too long.";
        }
    }

    public static void main(String[] args) {
        String phoneNumber1 = "1234567890";
        String phoneNumber2 = "9876543210";
        String phoneNumber3 = "12345"; // Too short
        String phoneNumber4 = "123456789012"; // Too long
        String phoneNumber5 = null; // Null number

        System.out.println(phoneNumber1 + " is " + validateMobileNumber(phoneNumber1));
        System.out.println(phoneNumber2 + " is " + validateMobileNumber(phoneNumber2));
        System.out.println(phoneNumber3 + " is " + validateMobileNumber(phoneNumber3));
        System.out.println(phoneNumber4 + " is " + validateMobileNumber(phoneNumber4));
        System.out.println("Null number is " + validateMobileNumber(phoneNumber5));
    }
}
