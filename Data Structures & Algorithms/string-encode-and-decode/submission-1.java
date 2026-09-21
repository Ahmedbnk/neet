class Solution {

    public String encode(List<String> strs) {
        String buffer = "";
        for(String str : strs)
            buffer += str + "ZxZ";
        return buffer;
    }

    public List<String> decode(String str) {
    List<String> result = new ArrayList<>();
    String[] parts = str.split("ZxZ", -1);
    for (int i = 0; i < parts.length - 1; i++)
        result.add(parts[i]);
    return result; 
    }
}
