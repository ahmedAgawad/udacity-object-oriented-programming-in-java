public class Queen extends Piece{
    boolean isValidMove(Position newPosition) {
        if(super.isValidMove(newPosition)) {
            return (newPosition.column == this.position.column + 1) || (Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row));
        }
        return false;
    }
}
