import java.sql.*;

public class RoomValidation {
    private static String RoomNoChecker(int roomNo) throws ClassNotFoundException, SQLException {

        Connection con = Connections.makeCon();
        String Query = "Select RoomNo from booking";
        PreparedStatement pstmt = con.prepareStatement(Query);
        ResultSet rs = pstmt.executeQuery();
        String Massage =null;
        while (rs.next()) {
            if (roomNo == rs.getInt("RoomNo")) {
                Massage="Already Booked";
            }else if (roomNo>200||roomNo<0) {
                Massage="Make Sure RoomNo Is Less 200 And Greater Than 0";
            }
        }
        return Massage;
        

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(RoomNoChecker(10));
    }
}
