class Solution {
  public String sortedString(String str)
  {
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    String sorted = new String(chars);
    return sorted;
  }
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<Integer>>map = new HashMap<>();
    List<List<String>> toBeReturned = new ArrayList<>();
    for(int i = 0; i < strs.length; i++)
    {
      String sorted = sortedString(strs[i]);
      if(!map.containsKey(sorted))
        map.put(sorted, new ArrayList<>());
      map.get(sorted).add(i);
    }
    map.forEach((word, list) ->
    {
      List<String>tmpArray = new ArrayList<>();
      for(int i = 0; i < list.size(); i++)
      {
        tmpArray.add(new String(strs[list.get(i)]));
      }
      toBeReturned.add(tmpArray);
    });
    return (toBeReturned);
  }
}
