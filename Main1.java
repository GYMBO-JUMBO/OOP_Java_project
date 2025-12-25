import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Reservation ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Guest name: ");
        String guestName = scanner.nextLine();

        System.out.print("Room type (Single / Double / Suite): ");
        String roomType = scanner.nextLine();

        System.out.print("Number of nights: ");
        int nights = scanner.nextInt();

        System.out.print("Price per night: ");
        double price = scanner.nextDouble();

        Guest guest = new Guest(guestName);
        Room room = new Room(roomType, price);
        Booking booking = new Booking(id, guest, room, nights);

        System.out.println();
        booking.showBookingInfo();

        scanner.close();
    }
}
