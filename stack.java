public class stack
{

   private int maxSize;

   private token[] stackArray;

   private int top;



   public stack(int s)

      {

      maxSize = s;

      stackArray = new token[maxSize];

      top = -1;

      }
   public void push(token j)

      {

      stackArray[++top] = j;

      }



   public token pop()

      {

      return stackArray[top--];

      }

   public token peek()

      {

      return stackArray[top];

      }



   public boolean almostEmpty()

      {

      return (top <= 0);

      }



   public boolean isFull()

      {

      return (top == maxSize-1);

      }

	public int getT()
	{
		return top;
	}
   }
