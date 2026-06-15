class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean valid = exist(board, word, 0, i, j, visited);
                if (valid) {
                    return valid;
                }
            }
        }

        return false;
    }

    public boolean exist(char[][] board, String word, int letterIdx, int row, int col,  boolean[][] visited) {
        if (letterIdx == word.length())  {
            return true;
        }
        if (row == board.length) {
            return false;
        }
        if (col == board[0].length) {
            return false;
        }
        if (row < 0 || col < 0) {
            return false;
        }
        if (visited[row][col]) {
            return false;
        }
        // check for word
        System.out.println(board[row][col] + " " + letterIdx);
        if (board[row][col] == word.charAt(letterIdx)) {
            visited[row][col] = true;
            // this may work
            boolean e = exist(board, word, letterIdx + 1, row - 1, col, visited) ||
                    exist(board, word, letterIdx + 1, row + 1, col, visited) ||
                    exist(board, word, letterIdx + 1, row, col - 1,  visited) ||
                    exist(board, word, letterIdx + 1, row, col + 1, visited);
            visited[row][col] = false;
            return e;
        }

        return false;
    }
}
