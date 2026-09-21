class Solution {
    char getPair(char c)
    {
        if(c == ']')
            return('[');
        else if(c == ')')
            return('(');
        return('{');
    }
    public boolean isValid(String s) {
        char chars[] = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < chars.length; i++)
        {
            if(stack.isEmpty() || chars[i] == '(' || chars[i] == '[' || chars[i] == '{')
                stack.push(chars[i]);
            else if(stack.peek() == getPair(chars[i]))
                stack.pop();
            else
                stack.push(chars[i]);
        }
        return(stack.isEmpty());
    }
}
