
public class Board {
	char[][] board;
	
	Board(int n,int m){
		this.board = new char[n][m];
		fillBoard(n,m);
	}
	
	public void fillBoard(int n,int m) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				this.board[i][j]='-';
			}
		}
	}
	
}
