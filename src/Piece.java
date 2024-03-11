public class Piece {
    //time since alg start - minutes
    private final int time;
    // price of piece at time
    private final double price;

    private static int totalMinutes;
    public Piece(double price, int time){
        this.time = time;
        this.price = price;
        this.totalMinutes++;
    }

    public static void main(String[] args){
        Piece p1 = new Piece(13.0, 10);

    }
}
