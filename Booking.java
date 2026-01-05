public class Booking {
    private int reservationId;
    private Room room;
    private int nights;

    public Booking(int reservationId, Guest guest, Room room, int nights) {
        this.reservationId = reservationId;
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
}
