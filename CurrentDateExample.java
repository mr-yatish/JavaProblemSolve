
    import java.time.LocalDate;

    public class CurrentDateExample {
        public  static String CurrentDate(int sign) {
            LocalDate currentDate = LocalDate.now();
            String [] arr=currentDate.toString().split("-");

            if (sign==0) {
                return arr[0];
            }else if (sign==1) {
                if (arr[1].equals("01")) {
                    return arr[1]="Jan";
                }
                else if (arr[1].equals("02")) {
                    return arr[1]="Feb";
                }
                else if (arr[1].equals("03")) {
                    return arr[1]="Mar";
                }
                else if (arr[1].equals("04")) {
                    return arr[1]="Apr";
                }
                else if (arr[1].equals("05")) {
                    return arr[1]="May";
                }
                else if (arr[1].equals("06")) {
                    return arr[1]="Jun";
                }
                else if (arr[1].equals("07")) {
                    return arr[1]="Jul";
                }
                else if (arr[1].equals("08")) {
                    return arr[1]="Aug";
                }
                else if (arr[1].equals("09")) {
                    return arr[1]="Sep";
                }
                else if (arr[1].equals("10")) {
                    return arr[1]="Oct";
                }
                else if (arr[1].equals("11")) {
                    return arr[1]="Nov";
                }
                else {
                    return arr[1]="Dec";
                }
                // return arr[1];
            }else{
                return arr[2];
            }
           
        }
    public static void main(String[] args) {
    System.out.println(CurrentDate(2));
    }
    }
    