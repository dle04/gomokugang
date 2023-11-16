public class Check 
{
    private Stack<Character> stack;

    public Gomoku() 
    {
        stack = new Stack<Character>();
    }

    public void play(char token) 
    {
        if (stack.size() < 5) 
            {
            stack.push(token);
            return;
            }
    }

        ArrayList<Character> matchingTokens = new ArrayList<Character>();

        char currentToken = stack.pop();

        while (!stack.empty()) 
            {
            char nextToken = stack.pop();

            if (currentToken == nextToken) 
            {
                matchingTokens.add(currentToken);

                if (matchingTokens.size() == 4) 
                {
                    System.out.println("Winner!");
                    return;
                }

                stack.push(matchingTokens.get(0));
                matchingTokens.clear();

            } 
            else 
            {
                stack.push(currentToken);
                currentToken = nextToken;
            }
        }

        stack.push(currentToken);

        stack.push(token);
    }
 }
