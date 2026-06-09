class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Stores the common prefix efficiently
        StringBuilder prefix = new StringBuilder();

        // Check each character position of the first string
        for (int index = 0; index < strs[0].length(); index++) {

            char currentChar = strs[0].charAt(index);

            // Compare this character with every other string
            for (int i = 1; i < strs.length; i++) {

                // If current string is too short
                // OR characters don't match
                if (index >= strs[i].length()
                        || strs[i].charAt(index) != currentChar) {

                    return prefix.toString();
                }
            }

            // All strings matched at this position
            prefix.append(currentChar);
        }

        return prefix.toString();
    }
}