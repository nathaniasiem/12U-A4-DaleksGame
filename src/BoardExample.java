
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class BoardExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Board b = new Board(12,12);
        //place peg on board
        //(colour of dalek,row,col)
        b.putPeg(Color.green, 3,5);
        b.putPeg(Color.BLUE, 1, 2);
        //if put another peg ontop of a placed peg
        //will override a peg, the peg underneath will be gone
        
        //remove a peg
        b.removePeg(3,5);
        
        //PUT MESSAGE ON BOARD
        b.displayMessage("Hello Everyone!");
       
        while(true){
            //do something with an action of click from user
        Coordinate click = b.getClick();
        //ask click for row
        int clickRow = click.getRow();
        //ask click for column
        int clickCol = click.getCol();
        //put peg on board with click
        b.putPeg(Color.yellow, clickRow, clickCol); 
        }
       
        
    }
}
