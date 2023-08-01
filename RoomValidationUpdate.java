import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomValidationUpdate {
     public static String RoomNoChecker1(int roomNo, int cl_id) throws ClassNotFoundException, SQLException {
        Connection con = Connections.makeCon();
        String Query = "Select RoomNo from booking where Cl_id <> Cl_id=" + cl_id;
        PreparedStatement pstmt = con.prepareStatement(Query);
        ResultSet rs = pstmt.executeQuery();
        String Massage = null;
        while (rs.next()) {
            System.out.println(rs.getInt("RoomNo"));
            if (roomNo == rs.getInt("RoomNo")) {
                Massage = "Already Booked";
            } else if (roomNo > 200 || roomNo < 0) {
                Massage = "Make Sure RoomNo Is Less 200 And Greater Than 0";
            }
        }
        return Massage;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       System.out.println( RoomNoChecker1(1, 1));
    }
}
