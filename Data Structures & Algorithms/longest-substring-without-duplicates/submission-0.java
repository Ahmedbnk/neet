class Solution {
    public static int lengthOfLongestSubstring(String s) {

    Set<Character> set = new HashSet<>();
    Queue<Character> queue = new LinkedList<>();
    char[] chars = s.toCharArray();
    int max = 0;
    for(int i = 0; i < chars.length; i++)
    {
        if(!set.contains(chars[i]))
        {
            set.add(chars[i]);
            queue.add(chars[i]);
        }
        else
        {
            while (!queue.isEmpty() && queue.peek() != chars[i])
            {
                set.remove(queue.poll());
            }
            set.remove(queue.poll());
            set.add(chars[i]);
            queue.add(chars[i]);
        }
        if(max < queue.size())
            max = queue.size();
    }
    return max;

    }
}