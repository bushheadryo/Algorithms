/**
* For any N x M board, find the number of times a diagonal of length L appears in the board
**/

public class Main {
    static int num (String[][] board, int l, String s) {
        int x; int y = board.length - l; int num = 0;
        // Positive slope scan
        x = l - 1;
        for (int i = 0; i < y + 1; i++) {
            for (int j = x; j < board[0].length; j++) {
                boolean check = true;
                for (int k = 1; k < l; k++) {
                    if (board[i][j].equals(board[i + k][j - k]) && board[i][j].equals(s)) {
                        ;
                    } else {
                        check = false; break;
                    }
                }
                num = num + (check ? 1 : 0);
            }
        }
        // Negative slope scan
        x = board[0].length - l;
        for (int i = 0; i < y + 1; i++) {
            for (int j = 0; j < x + 1; j++) {
                boolean check = true;
                for (int k = 1; k < l; k++) {
                    if (board[i][j].equals(board[i + k][j + k]) && board[i][j].equals(s)) {
                        ;
                    } else {
                        check = false; break;
                    }
                }
                num = num + (check ? 1 : 0);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String[][] board = {
                {"O", "O", "O", "-", "-", "O", "O", "O"},
                {"O", "O", "-", "-", "-", "-", "O", "O"},
                {"O", "-", "O", "-", "-", "O", "-", "O"},
                {"-", "-", "-", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "-", "-", "-", "-"},
                {"O", "-", "O", "-", "-", "O", "-", "O"},
                {"O", "O", "-", "-", "-", "-", "O", "O"},
                {"O", "O", "O", "-", "-", "O", "O", "O"}
        };
        System.out.println(num(board, 3, "O"));
    }
}
