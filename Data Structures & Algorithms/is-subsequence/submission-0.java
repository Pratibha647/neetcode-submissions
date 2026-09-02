class Solution {
    public boolean isSubsequence(String s, String t) {

        int left = 0;
        int right = 0;
        int count = 0;

        if (s == null || t == null) return false;

        while (right < t.length() && left < s.length()) {

            if (s.charAt(left) == t.charAt(right)) {
                count++;
                left++;
            }

            right++;
        }

        if (count == s.length()) return true;

        return false;
    }
}