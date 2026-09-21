class Solution {
    boolean isOpp(String str)
    {
        if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
            return(true);
        return(false);
    }
    int calculate(int a, int b, String str)
    {
        if(str.equals("+"))
            return(a + b);
        else if(str.equals("-"))
            return(a - b);
        else if(str.equals("*"))
            return(a * b);
        if(b != 0)
            return(a / b);
        return(0);
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(int i = 0; i < tokens.length; i++)
        {
            if(isOpp(tokens[i]))
            {
                int a = stack.pop();
                int b = stack.pop();
                int res = calculate(b, a, tokens[i]);
                stack.push(res);
            }
            else
                stack.push(Integer.parseInt(tokens[i]));
        }
        return(stack.peek());
    }
}
