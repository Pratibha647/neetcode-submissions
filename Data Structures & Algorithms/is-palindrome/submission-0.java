class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } 
            else {
                if (leftChar == rightChar) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}