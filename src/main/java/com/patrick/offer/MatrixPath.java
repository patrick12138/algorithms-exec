package com.patrick.offer;

public class MatrixPath {

    public static boolean exist1(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                word.charAt(i);
                System.out.print(board[i][j]);
            }
        }
        return false;
    }

    /**
     * 时间复杂度 O(3^KMN)O(3KMN) ： 最差情况下，需要遍历矩阵中长度为 KK 字符串的所有方案，时间复杂度为 O(3^K)O(3K)；
     * 矩阵中共有 MNMN 个起点，时间复杂度为 O(MN)O(MN) 。
     * 方案数计算： 设字符串长度为 KK ，搜索中每个字符有上、下、左、右四个方向可以选择，舍弃回头（上个字符）的方向，
     * 剩下 33 种选择，因此方案数的复杂度为 O(3^K)O(3K)。    
     * 空间复杂度 O(K)O(K) ： 搜索过程中的递归深度不超过 KK ，因此系统因函数调用累计使用的栈空间占用 O(K)O(K)
     * （因为函数返回后，系统调用的栈空间会释放）。最坏情况下 K = MNK=MN ，递归深度为 MNMN ，此时系统栈使用 O(MN)O(MN) 的额外空间
     *
     * @param board
     * @param word
     * @return
     */
    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        if (k == word.length - 1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}
