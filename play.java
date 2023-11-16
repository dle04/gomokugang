public class play
{

private board Board = new board();
private token Token = new token();
private check Check = new check();
private undo Undo = new undo();

private boolean win;

public play()
{
	Token = new token();
	Board = new board();
	Check = new check();
	System.out.println("To play, input the row you would like to play in and the column, then input your token type (1 or 2)");
	Board.print();
}

public void Play()
{
	Token.userSetR();
	Token.userSetC();
	Token.userSetV();
	int r = Token.getPlaceR();
	int c = Token.getPlaceC();
	int t = Token.getValue();
	if(Token.changeT(Board.getPlace(r,c).getValue()) == "-")
		{
			Board.setPlace(r,c,t);
			Undo.push(Board);
			Undo.peek().print();
			//Board.print();
		}
	System.out.println("Would you like to undo that move? Press y for yes and n for no");
	Token.userSetU();
	String u = Token.getUndo();
	String und = "y";
	if(u.equals(und))
	{
		Board.setPlace(r,c,0);
		Undo.pop();
		Undo.peek().print();
	}
	win = Check.checks(Board);
	if(win == true)
	{
		System.out.println("Congradulations, you win!");
	}
	else
	{
	System.out.println("Next players turn");
	Play();
	}
}
}
