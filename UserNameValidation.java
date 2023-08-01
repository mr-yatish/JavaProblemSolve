public class UserNameValidation {
    private static String userNameCheck(String Username) {
        char[] arr = Username.toCharArray();
        String result=null;

        for (char c : arr) {
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c==' ') {
                result="Valid";
            }else{
                result="Invalid";
                break;
            }
        }
        return result;
       
    }

    public static void main(String[] args) {
        String Name = "Yat ish prajap at";
        Name=Name.replaceAll("\\s","");
        System.out.println(Name);
        // System.out.println(userNameCheck(Name));
    }
}
