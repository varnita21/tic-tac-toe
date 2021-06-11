
public class Operations {
	Board b;
	Players p1;
	Players p2;
	int N;
	int M;
	char turn ='X';
	
	public void defineBoardSize(int x,int y) {
		b=new Board(x,y);
		N=x;
		M=y;
	}
	
	public void addPlayers(String name,char input) {
		if(p1 == null) {
			p1 = new Players(name, input);
		}else if(p2 == null && p1.input != input)
			p2 = new Players(name,input);
		else {
			System.out.println("Sorry, wrong input");
		}
	}
	
	public void addMoves(int i, int j) {
		i=i-1;j=j-1;
		if(i>0 && i<3 && j>0 && j<3 && b.board[i][j] != '-') {
			System.out.println("Invalid move");
		}else if(b.board[i][j] == '-') {
				b.board[i][j] =turn;
				if(turn == 'X') {
					turn ='0';
				}else
					turn = 'X';
		}
		printBoard();
		checkWinner();
	}
	
	public void checkWinner() {
		for (int a = 0; a < 4; a++) {
            String line = null;
  
            /* for lesser Time Complexity
           switch (a) {
            case 0:
                line = ""+b.board[0][0] + b.board[0][1] + b.board[0][2];
                break;
            case 1:
                line = ""+b.board[1][0] + b.board[1][1] + b.board[1][2];
                break;
            case 2:
                line = ""+b.board[2][0] + b.board[2][1] + b.board[2][2];
                break;
            case 3:
            	line = ""+b.board[0][0] + b.board[1][0] + b.board[1][0];
                break;
            case 4:
            	line = ""+b.board[0][1] + b.board[1][1] + b.board[2][1];
                break;
            case 5:
            	line = ""+b.board[0][2] + b.board[1][2] + b.board[2][2];
                break;
            case 6:
            	line = ""+b.board[0][0] + b.board[1][1] + b.board[2][2];
                break;
            case 7:
            	line = ""+b.board[0][2] + b.board[1][1] + b.board[2][0];
                break;
            }
            */
            
            
            
            
            
            switch (a) {
            case 0:
            	
            	for(int i=0;i<N;i++) {
                	for(int j=0;j<M;j++) {
                		line = ""+b.board[i][j] + b.board[i][j] + b.board[i][j];
                	}
            		testWinner(line);
            		line="";
            	}
                break;
            case 1:
            	for(int i=0;i<N;i++) {
                	for(int j=0;j<M;j++) {
                		line = ""+b.board[j][i] + b.board[j][i] + b.board[j][i];
                	}
            		testWinner(line);
            		line="";
            	}
                break;
            case 2:
            	for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if (i == j) {
                        	line += ""+b.board[i][j];
                        }
                    }
                }
            	testWinner(line);
                break;
            case 3:
            	for (int i = 0; i < N; i++) {
                    for (int j = 0; j < M; j++) {
                        if ((i + j) == (N - 1)) {
                        	line += ""+b.board[i][j];
                        }
                    }
                }
            	testWinner(line);
                break;
            }
            
            
		}
		
		
	}
	public void testWinner(String line) {
		//For X winner
        if (line.equals("XXX")) {
        	if(p1.input == 'X') 
        		System.out.println(p1.name + " Won");
        	else
        		System.out.println(p2.name + " Won");
        }
          
        // For O winner
        else if (line.equals("OOO")) {
        	if(p1.input == '0') 
        		System.out.println(p1.name + " Won");
        	else
        		System.out.println(p2.name + " Won");
        }
	}
	
	public void printBoard() {
		int test=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(b.board[i][j] != '-') {
					test++;
				}
				System.out.print(b.board[i][j]+" ");
			}
			System.out.println("");
		}
		if(test ==9) {
			System.out.println("Game Over");
		}
	}
}
