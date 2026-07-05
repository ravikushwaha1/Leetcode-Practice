class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> ravi = new HashSet<>();
        for(int i = 0; i < s.length();i++){
           ravi.add(s.charAt(i));
        }
        return ravi.size();
    }
}