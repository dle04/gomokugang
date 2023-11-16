import java.util.Scanner;
public class token
{
    public token()
    {
    	placeR = 0;
    	placeC = 0;
        value = 0;
        undo = null;
        
    }
    
    public token(int r, int c, int v, String u)
    {
    	placeR = r;
    	placeC = c;
        value = v;
        undo = u;
    }
    
    private int placeR;
    private int placeC;
    private int value;
    private String undo;
    Scanner user = new Scanner(System.in);
    
    public int getPlaceR()
    {
    	return placeR;
    }
    
    public void setPlaceR(int row)
    {
    	placeR = row;
    }
    
    public void userSetR()
    {
    	int row = user.nextInt();
    	setPlaceR(row);
    }
    
    public int getPlaceC()
    {
    	return placeC;
    }
    
    public void setPlaceC(int col)
    {
    	placeC = col;
    }
    
    public void userSetC()
    {
    	int col = user.nextInt();
    	setPlaceC(col);
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setValue(int val)
    {
        value = val;
    }
    
    public void userSetV()
    {
    	int val = user.nextInt();
    	setValue(val);
    }
    
    public String getUndo()
    {
    	return undo;
    }
    
    public void setUndo(String und)
    {
    	undo = und;
    }
    
    public void userSetU()
    {
    	String und = user.next();
    	setUndo(und);
    }

public String changeT(int v)
{
	String out = null;
	if(v == 1)
	{
		out = "X";
	}
	if(v == 2)
	{
		out = "O";
	}
	if(v == 0)
	{
		out = "-";
	}
	return out;
}
}
