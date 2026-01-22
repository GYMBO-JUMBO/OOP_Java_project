import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {

    public void saveRoom(Room room) {
        String sql = "INSERT INTO rooms (room_type, price_per_night) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, room.getRoomType());
            pstmt.setDouble(2, room.getPricePerNight());

            pstmt.executeUpdate();
            System.out.println("Комната сохранена: " + room.getRoomType());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        String sql = "SELECT * FROM rooms";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Room room = new Room(
                    rs.getString("room_type"),
                    rs.getDouble("price_per_night")
                );
                rooms.add(room);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rooms;
    }
}