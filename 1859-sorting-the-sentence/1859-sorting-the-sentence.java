class Solution {
    public String sortSentence(String s) {

        // Step 1: Split the sentence into words
        String[] words = s.split(" ");

        // Step 2: Create a new array to store words in correct order
        String[] ans = new String[words.length];

        // Step 3: Visit each word
        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            // Step 4: Get the last character (the position)
            char last = word.charAt(word.length() - 1);

            // Step 5: Convert character to integer
            int position = last - '0';

            // Step 6: Remove the last character (digit)
            String originalWord = word.substring(0, word.length() - 1);

            // Step 7: Store the word at the correct position
            ans[position - 1] = originalWord;
        }

        // Step 8: Join all words into one sentence
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ans.length; i++) {
            result.append(ans[i]);

            // Don't add a space after the last word
            if (i != ans.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}