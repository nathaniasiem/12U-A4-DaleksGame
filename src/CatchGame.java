
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
    private int Board;
    private Doctor doctor;
    private Dalek dk1,dk2,dk3;

    /**
     * The constructor for the game. Use it to initialize your game variables.
     * (create people, set positions, etc.)
     */
    public CatchGame() {
        //create the 12x12 board
        Board b = new Board(12,12);
        //create positions
        int bRow=(int)Math.random()*12;
        int bCol = (int)Math.random()*12;
        
        //create people
        Doctor doctor= new Doctor(bRow,bCol);
        Dalek dk1 = new Dalek(bRow,bCol);
        Dalek dk2 = new Dalek(bRow,bCol);
        Dalek dk3 = new Dalek(bRow,bCol);
        
        //places characters onto the board
        b.putPeg(Color.BLACK, dk1.getRow(),dk1.getCol());
        b.putPeg(Color.BLACK, dk2.getRow(),dk2.getCol());
        b.putPeg(Color.BLACK, dk3.getRow(),dk3.getCol());
        
        
    }

    /**
     * The playGame method begins and controls a game: deals with when the user
     * selects a square, when the Daleks move, when the game is won/lost.
     */
    public void playGame() {
        
            
        }
    }
}
