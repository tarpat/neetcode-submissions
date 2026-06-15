class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        gen(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    public void gen(List<String> list, StringBuilder str, int open, int close, int n) {
        if (open == n && close == n) {
            list.add(str.toString());
        }
        if (open < close) {
            return;
        }
        if (open < n) {
            gen(list, str.append("("), open + 1, close, n);
            str.deleteCharAt(str.length() - 1);
        }
        if (close < n) {
            gen(list, str.append(")"), open, close + 1, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}
