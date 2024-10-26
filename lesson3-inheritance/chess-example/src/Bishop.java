public class Bishop extends Piece {
    boolean isValidMove(Position newPosition) {
        return Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row);
    }
}
