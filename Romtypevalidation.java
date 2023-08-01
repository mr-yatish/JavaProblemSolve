import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Romtypevalidation {
    public static String[] RoomTP(String RoomType, String price,int Cl_id) throws ClassNotFoundException, SQLException {
        Connection con = Connections.makeCon();
        String Query = "Select Price,RoomType from booking where Cl_id"+Cl_id;
        PreparedStatement pstmt = con.prepareStatement(Query);
        ResultSet rs = pstmt.executeQuery();
        String arr[] = new String[2];
        arr[0] = RoomType;
        arr[1] = price;
        if (arr[0] == "Normal"&&rs.getString("RoomType")=="Normal") {
            arr[1] = "1000";
        } else if (arr[0] == "Standard"&&rs.getString("RoomType")=="Standard") {
            arr[1] = "2000";
        } else if (arr[0] == "Deluxe"&&rs.getString("RoomType")=="Deluxe") {
            arr[1] = "3000";
        } else if (arr[0] == "Exicutive"&&rs.getString("RoomType")=="Exicutive") {
            arr[1] = "5000";
        }else if (arr[1]=="1000"&&rs.getInt("Price")==1000) {
            arr[0]="Normal";
        }
        return arr;

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String[]arr=RoomTP("Deluxe", "3000", 1);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
