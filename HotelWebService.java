import io.javalin.Javalin;

public class HotelWebService {
    public static void main(String[] args) {
        GuestDAO guestDao = new GuestDAO();
        RoomDAO roomDao = new RoomDAO();
        BookingDAO bookingDao = new BookingDAO();

        Javalin app = Javalin.create().start(8080);

        app.get("/guests", ctx -> ctx.json(guestDao.getAllGuests()));

        app.get("/rooms", ctx -> ctx.json(roomDao.getAllRooms()));

        app.get("/bookings", ctx -> ctx.json(bookingDao.getAllBookings()));

        System.out.println("REST API Success.");
    }
}