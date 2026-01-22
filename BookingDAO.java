import java.sql.*;

public class BookingDAO {
    public void saveBooking(Booking booking, int guestId, int roomId) {
        String sql = "INSERT INTO bookings (reservation_id, guest_id, room_id, nights) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, booking.getReservationId()); //
            pstmt.setInt(2, guestId); 
            pstmt.setInt(3, roomId);
            pstmt.setInt(4, booking.getNights()); //
            
            pstmt.executeUpdate();
            System.out.println("Бронирование #" + booking.getReservationId() + " создано.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}