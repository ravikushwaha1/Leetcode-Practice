class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder res = new StringBuilder();

        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;

        while (p1 >= 0 || p2 >= 0 || carry != 0) {

            int s1 = 0;
            int s2 = 0;

            if (p1 >= 0) {
                s1 = num1.charAt(p1--) - '0';
            }

            if (p2 >= 0) {
                s2 = num2.charAt(p2--) - '0';
            }

            int sum = s1 + s2 + carry;

            carry = sum / 10;
            res.append(sum % 10);
        }

        return res.reverse().toString();
    }
}