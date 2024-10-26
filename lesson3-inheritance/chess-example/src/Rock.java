public class Rock extends Piece {
    boolean isValidMove(Position newPosition) {
        return newPosition.column == this.position.column || newPosition.row == this.position.row;
    }
}
