class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")) {
                // we are adding a number
                st.push(Integer.parseInt(token));
            } else {
                // this is an operation
                int i = st.pop(); // second number
                int j = st.pop(); // first number
                if (token.equals("+")) {
                    st.push(j + i);
                }
                if (token.equals("-"))
                    st.push(j - i);
                if (token.equals("*"))
                    st.push(j * i);
                if (token.equals("/"))
                    st.push(j / i);
            }
        }
        return st.pop();
    }
}
