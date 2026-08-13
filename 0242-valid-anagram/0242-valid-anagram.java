class Solution {
    public boolean isAnagram(String s, String t) {
        int[] hash1 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash1[s.charAt(i) - 'a'] += 1;
        }
        for (int j = 0; j < t.length(); j++) {
            hash1[t.charAt(j) - 'a'] -= 1;
        }

        for (int i = 0; i < 26; i++) {
            if (hash1[i] != 0) {
                return false;
            }
        }
        return true;

    }
}