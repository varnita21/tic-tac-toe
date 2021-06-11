
public class PlayTicTacToe {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op = new Operations();
		op.defineBoardSize(3, 3);
		op.addPlayers("Gaurav",'X');
		op.addPlayers("Sagar", '0');
		op.addMoves(2, 2);
		op.addMoves(1, 3);
		op.addMoves(1, 1);
		op.addMoves(1, 2);
		op.addMoves(2, 2);
		op.addMoves(3, 3);
	}

}
