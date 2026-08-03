class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                sb.append(s.charAt(i));
            } else {
                char prev = s.charAt(i - 1);
                int shift = s.charAt(i) - '0';

                char next = (char) (prev + shift);
                sb.append(next);
            }

        }
        return sb.toString();
    }

}