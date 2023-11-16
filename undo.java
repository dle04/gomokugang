public class undo extends board
{

private board[] undoStk;
private int top;
private String u;

public String getU()
{
	return u;
}

public void setU(String U)
{
	u = U;
}

public void getT()
{
	System.out.println(top);
}

public undo()
{
	super();
	undoStk = new board[225];
	top = -1;
}

public void push(board j)
{
	undoStk[++top] = j;
}

public board pop()
{
	return undoStk[top--];
}

public board peek()
{
	return undoStk[top];
}

public boolean isEmpty()
{
	return (top == -1);
}

public boolean isFull()
{
	return (top == 224);
}

/*public void undoMove()
{
	board nBoard = null;
	pop();
	pop();
	nBoard = pop();
	nBoard.print();
} */
}
