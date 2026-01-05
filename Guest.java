public class Guest extends Person {
    private int reservationId;
    public Guest(String name, int reservationId) {
        super(name);
        setReservationId(reservationId);
    }
    @Override
    public void printDetails() {
        System.out.println("Guest: " + getName() + " (Booking ID: " + reservationId + ")");
    }
    public int getReservationId() {
        return reservationId;
    }
    public void setReservationId(int reservationId){
        this.reservationId = reservationId;
    }
}
