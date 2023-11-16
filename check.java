import java.util.*;
public class check extends board
{
public check()
{
	super();
}

private stack checker1 = new stack(6);
private stack checker2 = new stack(6);
private stack checker3 = new stack(6);
private stack checker4 = new stack(6);

//stack[] checkers = {checker1, checker2, checker3, checker4, checker5};

    public boolean checks(board a)
    {
        boolean chk = false;
        
	for(int r = 0; r < 10; r++)
	{
		for(int c = 0; c < 10; c++)
		{
			for(int n = 0; n < 5; n++)
			{
				checker1.push(a.getPlace(r+n,c+n));
				checker2.push(a.getPlace(r+n,c));
				checker3.push(a.getPlace(r,c+n));
				checker4.push(a.getPlace(r+4-n,c+n));
			}
			if(verify(checker1) == true || verify(checker2) == true || verify(checker3) == true || verify(checker4))
			{
				chk = true;
			}
			break;
		}
		break;
	}

        return chk;
    }
    public boolean verify(stack checker)
    {
    	ArrayList<token> matches = new ArrayList<token>();
    	boolean ver = false;
    	while(checker.almostEmpty() != true)
        {
            	token first = checker.pop();
            	token second = checker.pop();
            	int length = 0;
            	if(first.getValue() == second.getValue() && first.getValue() != 0 && second.getValue() != 0)
            	{
                	matches.add(first);
            	    	checker.push(second);
           	     	length = matches.size();
           	}
           	else
           	{
           	 	checker.push(second);
           	}
            	if(length == 4)
            	{
                	ver = true;
            	}
    	}
    	return ver;
    }
}
