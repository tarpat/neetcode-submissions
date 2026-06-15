class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            while ((s.charAt(left) < 48 || s.charAt(left) > 57) && (s.charAt(left) < 97 || s.charAt(left) > 122) && left < right) {
                left++;
                System.out.println(left + " " + right);
            }
            while ((s.charAt(right) < 48 || s.charAt(right) > 57) && (s.charAt(right) < 97 || s.charAt(right) > 122) && left < right) {
                right--;
                System.out.println(left + " " + right);
            }
            System.out.println(left + " " + right);
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
