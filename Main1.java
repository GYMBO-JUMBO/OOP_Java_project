public class Main1 {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Person("Dillon");
        people[1] = new Guest("Maria", 555);
        System.out.println("&--- List of people in the system ---&");
        for (Person p : people) {
            p.printDetails(); 
        }
        Guest guest = new Guest("John Doe", 101);
        Room room = new Room("Deluxe Suite", 150.00);
        Booking booking = new Booking(101, guest, room, 3);
        System.out.println("&----- Reservation Info -----&");
        System.out.println("Reservation ID: " + booking.getReservationId());
        System.out.println("Guest: " + guest.getName());
        System.out.println("Room type: " + room.getRoomType());
        System.out.println("Nights: " + booking.getNights());
        System.out.println("Price per night: $" + room.getPricePerNight());
        System.out.println("Total price: $" + booking.calculateTotalPrice());
        System.out.println(room.toString());
    }
}
