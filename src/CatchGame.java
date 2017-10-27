
import java.awt.Color;

/**
 * This class manages the interactions between the different pieces of the game:
 * the Board, the Daleks, and the Doctor. It determines when the game is over
 * and whether the Doctor won or lost.
 */
public class CatchGame {

    /**
     * Instance variables go up here Make sure to create a Board, 3 Daleks, and
     * a Doctor
     */
    private Board board;
    private Doctor doctor;
    private Dalek dk1, dk2, dk3;

    /**
     * The constructor for the game. Use it to initialize your game variables.
     * (create people, set positions, etc.)
     */
    public CatchGame() {
        //create the 12x12 board
        this.board = new Board(12, 12);

        //create position for doctor 
        int bRow = (int) (Math.random() * 12);
        int bCol = (int) (Math.random() * 12);
        doctor = new Doctor(bRow, bCol);
        //create position for dalek 1
        int d1Row = (int) (Math.random() * 12);
        int d1Col = (int) (Math.random() * 12);
        dk1 = new Dalek(d1Row, d1Col);
        //create position for dalek 2
        int d2Row = (int) (Math.random() * 12);
        int d2Col = (int) (Math.random() * 12);
        dk2 = new Dalek(d2Row, d2Col);
        //create position for dalek 3
        int d3Row = (int) (Math.random() * 12);
        int d3Col = (int) (Math.random() * 12);
        dk3 = new Dalek(d3Row, d3Col);

        //places daleks randomly onto the board
        board.putPeg(Color.BLACK, dk1.getRow(), dk1.getCol());
        board.putPeg(Color.BLACK, dk2.getRow(), dk2.getCol());
        board.putPeg(Color.BLACK, dk3.getRow(), dk3.getCol());

        //places the doctor randomly onto the board
        board.putPeg(Color.GREEN, doctor.getRow(), doctor.getCol());

    }

    /**
     * The playGame method begins and controls a game: deals with when the user
     * selects a square, when the Daleks move, when the game is won/lost.
     */
    public void playGame() {
        
    }
}
