package palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String s = "" + x;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Create a testcase.
        System.out.println(solution.isPalindrome(5324452)); // false
        System.out.println(solution.isPalindrome(123454321)); // true
        System.out.println(solution.isPalindrome(-133121331)); // false
    }
}
