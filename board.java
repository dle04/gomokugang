import java.util.*;
public class board
{
public board()
{
	token[][] Board = new token[15][15];
	token Token = new token();
	setBoard();
}
public token[][] getBoard()
{
	return Board;
}

public token[][] setBoard()
{
	for(int r = 0 ; r < 15 ; r++)
	{
		for(int c = 0 ; c < 15 ; c++)
		{
			Board[r][c] = Token;
		}
	}
	return Board;
}

private static token[][] Board = new token[15][15];
private static token Token = new token();

public token getPlace(int r, int c)
{
	return Board[r][c];
}

public void setPlace(int r, int c, int t)
{
	Board[r][c] = new token(0, 0, t, null);
}

public static void print()
{
	String[][] tBoard = new String[15][15];
	for(int r=0; r < 15; r++)
        {
            for(int c=0; c < 15; c++)
            {
                tBoard[r][c] = Token.changeT(Board[r][c].getValue());
            }
        }
	for (String[] r : tBoard)
	{
		System.out.println(Arrays.toString(r));
	}
}
}
