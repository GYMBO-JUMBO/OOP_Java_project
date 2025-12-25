public class Booking {
    private int reservationId;
    private Guest guest;
    private Room room;
    private int nights;

    public Booking(int reservationId, Guest guest, Room room, int nights) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.room = room;
        this.nights = nights;
    }

    public int getReservationId() {
        return reservationId;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        if (nights > 0) {
            this.nights = nights;
        }
    }

    public double calculateTotalPrice() {
        return nights * room.getPricePerNight();
    }

    public void showBookingInfo() {
        System.out.println("&----- Reservation Info -----&");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Guest: " + guest.getName());
        System.out.println("Room type: " + room.getRoomType());
        System.out.println("Nights: " + nights);
        System.out.println("Price per night: $" + room.getPricePerNight());
        System.out.println("Total price: $" + calculateTotalPrice());
    }
}
