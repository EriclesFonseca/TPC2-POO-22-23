public class Exercicio1 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                if((row + col) % 2 == 0) {
                    board[row][col] = 0;
                }
                else {
                    board[row][col] = 1;
                }
            }
        }

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }
}