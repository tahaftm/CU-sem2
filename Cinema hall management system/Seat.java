
public class Seat {

    String seatID;
    SeatType seatType;
    String row;
    boolean isAvailable;
    double price;

    static int counter = 1;

    Seat(SeatType type, String row) {
        seatID = row+String.format("%02d", counter++);
        this.seatType = type;
        this.row = row;
    }

    public String getSeatID() {
        return seatID;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public String getRow() {
        return row;
    }

    public boolean isAvailbe() {
        return isAvailable;
    }

    public String toString(){
        return String.format("%s %s %s %f %b", seatID, seatType,row,seatType.price,isAvailable);
    }

}
enum SeatType {
    VIP(20), PREMIUM(15), REGULAR(10);
    double price;
    SeatType(double price) {
        this.price = price;
    }
}