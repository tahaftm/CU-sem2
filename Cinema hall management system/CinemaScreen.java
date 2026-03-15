public class CinemaScreen{
    String name;
    String id;
    String type;
    Seat seats[][];

    CinemaScreen(String name, String id, int seatCount) {
        this.name = name;
        this.id = id;
        this.type = type;
        seats = new Seat[5][];
        seats[0] =new Seat[10];
        seats[1] =new Seat[11];
        seats[2] =new Seat[12];
        seats[3] =new Seat[13];
        seats[4] =new Seat[14];

        for (int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++){
                seats[i][j] = new Seat(SeatType.REGULAR, " "+ i);
            }   
        }
    }

    public void displaySeat(){
        for (int i=0; i < seats.length; i++){
            System.err.println();
            for (int j = 0; j < seats[i].length; j++){
                System.out.print(seats[i][j] + "    ");
            }
        }
    }
}