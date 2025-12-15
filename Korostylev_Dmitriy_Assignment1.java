import java.util.Scanner;
public class Korostylev_Dmitriy_Assignment1{
    public static class HotelReservation{
    private int reservationId;
    private String guestName;
    private String roomType;
    private int nights;
    private double pricePerNight;
    public HotelReservation(int reservationId, String guestName, String roomType, int nights, 
            double pricePerNight){
                this.reservationId = reservationId;
                this.guestName = guestName;
                this.roomType = roomType;
                this.nights = nights;
                this.pricePerNight = pricePerNight;
        }
        public int getreservationId(){
            return reservationId;
        }
        public String getguestName(){
            return guestName;
        }
        public String getroomType(){
            return roomType;
        }
        public int getnights(){
            return nights;
        }
        public double getpricePerNight(){
            return pricePerNight;
        }
        public void setguestName(String guestName){
            this.guestName = guestName;
        }
        public void setroomType(String roomType){
            this.roomType = roomType;
        }
        public void setnights(int nights){
            if (nights > 0){
                this.nights = nights;
            }
        }
        public void setpricePerNight(double pricePerNight){
            if (pricePerNight > 0){
                this.pricePerNight = pricePerNight;
            }
        }
        public double calculateTotalPrice() {
            return nights * pricePerNight;
        }
        public void showReservationInfo() {
            System.out.println("&----- Reservation Info -----&");
            System.out.println("Reservation ID: " + reservationId);
            System.out.println("Guest: " + guestName);
            System.out.println("Room type: " + roomType);
            System.out.println("Nights: " + nights);
            System.out.println("Price per night: $" + pricePerNight);
            System.out.println("Total price: $" + calculateTotalPrice());
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Reservation ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Guest name: ");
        String name = scanner.nextLine();
        System.out.print("Room type (Single / Double / Suite): ");
        String roomType = scanner.nextLine();
        System.out.print("Number of nights: ");
        int nights = scanner.nextInt();
        System.out.print("Price per night: ");
        double price = scanner.nextDouble();
        HotelReservation reservation = new HotelReservation(id, name, roomType, nights, price);
        System.out.println();
        reservation.showReservationInfo();
        scanner.close();
    }
}