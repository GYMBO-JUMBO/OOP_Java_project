import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GuestDAO {
    public void saveGuest(Guest guest) {
        String sql = "INSERT INTO guests (name, reservation_id) VALUES (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, guest.getName());
            pstmt.setInt(2, guest.getReservationId());
            pstmt.executeUpdate();
            System.out.println("Гость сохранен: " + guest.getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Guest> getAllGuests() {
        List<Guest> guests = new ArrayList<>();
        String sql = "SELECT name, reservation_id FROM guests";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                guests.add(new Guest(rs.getString("name"), rs.getInt("reservation_id")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return guests;
    }
}