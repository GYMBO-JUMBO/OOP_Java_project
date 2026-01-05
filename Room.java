public class Room {
    private String roomType;
    private double pricePerNight;

    public Room(String roomType, double pricePerNight) {
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setPricePerNight(double pricePerNight) {
        if (pricePerNight > 0) {
            this.pricePerNight = pricePerNight;
        }
    }
    @Override
    public String toString() {
        return "Room[" + roomType + ", $" + pricePerNight + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Double.compare(room.pricePerNight, pricePerNight) == 0 && 
               roomType.equals(room.roomType);
    }
    @Override
    public int hashCode() {
        int result = roomType.hashCode();
        long temp = Double.doubleToLongBits(pricePerNight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
