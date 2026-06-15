class Solution {
    public boolean isValidSudoku(char[][] board) {
        return validRows(board) && validCols(board) && validSections(board);
    }
    public boolean validRows(char[][] board) {
        for (char[] row : board) {
            Set<Character> set = new HashSet<>();
            for (char elm : row) {
                if (elm != '.' && set.contains(elm)) {
                    return false;
                }
                set.add(elm);
            }
        }
        return true;
    }

    public boolean validCols(char[][] board) {
        for (int i = 0; i < board[0].length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.' && set.contains(board[j][i])) {
                    return false;
                }
                set.add(board[j][i]);
            }
        }
        return true;
    }

    public boolean validSections(char[][] board) {
        ArrayList<HashSet<Character>> list = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) {
                list = new ArrayList<>();
                for (int z = 0; z < 3; z++) {
                    list.add(new HashSet<>());
                }
            }
            for (int j = 0; j < board[0].length; j++) {
                int square = (j / 3);
                if (board[i][j] != '.' && list.get(square).contains(board[i][j])) {
                    return false;
                }
                list.get(square).add(board[i][j]);
            }
        }

        return true;
    }
}
