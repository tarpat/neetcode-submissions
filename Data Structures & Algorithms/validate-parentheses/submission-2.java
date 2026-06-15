class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.size() == 0) {
                    return false;
                }
                char j = stack.pop();
                if (c == ')')  {
                    if (j != '(') return false;
                }
                if (c == '}')  {
                    if (j != '{') return false;
                }
                if (c == ']')  {
                    if (j != '[') return false;
                }
            }
        }

        if (stack.size() > 0) return false;
        return true;
    }
}
