
/**
 * This class models the Doctor in the game. A Doctor has a position and can
 * move to a new position.
 */
public class Doctor {

    private int row, col;

    /**
     * Initializes the variables for a Doctor.
     *
     * @param theRow The row this Doctor starts at.
     * @param theCol The column this Doctor starts at.
     */
    public Doctor(int theRow, int theCol) {
        this.row = theRow;
        this.col = theCol;
    }

    /**
     * Move the Doctor. If the player clicks on one of the squares immediately
     * surrounding the Doctor, the peg is moved to that location. Clicking on
     * the Doctor does not move the peg, but instead allows the Doctor to wait
     * in place for a turn. Clicking on any other square causes the Doctor to
     * teleport to a random square (perhaps by using a �sonic screwdriver�).
     * Teleportation is completely random.
     *
     * @param newRow The row the player clicked on.
     * @param newCol The column the player clicked on.
     */
    public void move(int newRow, int newCol) {
        //randomize position for doctor 
        int rdmCol = (int) (Math.random() * 12);
        int rdmRow = (int) (Math.random() * 12);

        //condition for doctor to move forward when the distance between the new and old coordinate is greater than equal to -1 or 1     
        if (newRow - this.row >= -1 && newCol - this.col >= -1 || newRow - this.row >= 1 && newCol - this.col >= 1) {
            newRow = this.row++;
            newCol = this.col++;
        } //condition for doctor to move backward when the distance between the new and old coordinate is less than -1 or 1
        else if (newRow - this.row < -1 && newCol - this.col < -1 || newRow - this.row < 1 && newCol - this.col < 1) {
            newRow = this.row--;
            newCol = this.col--;
        } //condition when the new coordinate is equal to -1 or 12, teleport the doctor to a new location on the board
        if (newRow== -1 && newCol == -1||newRow== 12 && newCol== 12) {           
            newRow = rdmRow;           
            newCol = rdmCol;
       }
    }

    /**
     * Returns the row of this Doctor.
     *
     * @return This Doctor's row.
     */
    public int getRow() {
        return this.row;
    }

    /**
     * Returns the column of this Doctor.
     *
     * @return This Doctor's column.
     */
    public int getCol() {
        return this.col;
    }
}
