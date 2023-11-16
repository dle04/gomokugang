public class Board
{
    public static String[][] board = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    public static void play(String p, String t)
    {
        for(int i=0;i < 3; i++)
        {
            for(int j=0; j < 3;j++)
            {
                if (board[i][j]==p)
                {
                    board[i][j] = t;
                }
            }
        }
        print();
	check();
    }
    public static void check()
    {
        if (board[0][0] == board[1][0] && board[0][0] == board[2][0])
        {
            System.out.println("You win!");
        }
        if (board[0][1] == board[1][1] && board[0][1] == board[2][1])
        {
            System.out.println("You win!");
        }
        if (board[0][2] == board[1][2] && board[0][2] == board[2][2])
        {
            System.out.println("You win!");
        }
        if (board[0][0] == board[0][1] && board[0][0] == board[0][2])
        {
            System.out.println("You win!");
        }
        if (board[1][0] == board[1][1] && board[1][0] == board[1][2])
        {
            System.out.println("You win!");
        }
        if (board[2][0] == board[2][1] && board[2][0] == board[2][2])
        {
            System.out.println("You win!");
        }
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2])
        {
            System.out.println("You win!");
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0])
        {
            System.out.println("You win!");
        }
    }
 /*   public static void print()
    {
        String x = "";
        for(String i : board)
        {
            //x += i;
		System.out.println(i);
        }
       // System.out.println(x);
    } */
	public static void print()
	{
		int rows = 3;
		int columns = 3;
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < columns; j++) 
			{
                		System.out.print(board[i][j]);
            		}
            //System.out.println();
		}
	}
public static void main(String[] args)
    {
        play("1", "X");
        play("5", "O");
        play("9", "X");
        play("3", "O");
        play("7", "X");
        play("4", "O");
        play("8", "X");
    }
}
