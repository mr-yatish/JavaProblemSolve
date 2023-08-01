import java.util.Scanner;

public class GmailContentChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Gmail Content Checker Program!");
        System.out.println("This program will check if an email address contains '@gmail.com' along with some content before it.");

        while (true) {
            System.out.print("Please enter an email address (or type 'exit' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            if (containsGmailWithContent(input)) {
                System.out.println("The email contains '@gmail.com' with some content before it.");
            } else {
                System.out.println("The email does not contain '@gmail.com' or it doesn't have any content before it.");
            }
        }

        scanner.close();
    }

    private static boolean containsGmailWithContent(String email) {
        int atIndex = email.indexOf("@");
        if (atIndex > 0) {
            String contentBeforeAt = email.substring(0, atIndex);
            System.out.println(contentBeforeAt);
            return contentBeforeAt.length() > 0 && email.substring(atIndex).equalsIgnoreCase("@gmail.com");
        }
        return false;
    }
}
