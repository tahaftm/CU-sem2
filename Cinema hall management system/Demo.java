public class Demo{
    public static void main(String[] args) {
        Seat seat1 = new Seat(SeatType.REGULAR, "A");
        System.out.println(seat1);

        CinemaScreen cinemascreen = new CinemaScreen("CinemaHallKarachi", "1", 40);   
        cinemascreen.displaySeat();

        CityCinema cityCinema = new CityCinema("Lahore Emporium", 6, "Lahore");
        System.out.println(cityCinema);
    }
}