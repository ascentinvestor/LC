class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        boolean set = true;
        String output = "";

        while (index < strs[0].length()) {
            set = true;

            char currentCha = strs[0].charAt(index);

            for (int i = 0; i < strs.length; i++) {
                if (index >= strs[i].length() || currentCha != strs[i].charAt(index)) {
                    set = false;
                    break;
                }
            }

            if (set) {
                output = output + strs[0].charAt(index);
                index++;
            } else {
                break;
            }
        }

        return output;
    }
}