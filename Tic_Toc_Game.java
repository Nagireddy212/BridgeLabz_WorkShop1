package tictactoe;

public class Tic_Toc_Game
{
    public static void main(String[] args)
    {
        char[] board = createBoard();
    }

    public static char[] createBoard()
    {
        char[] board = new char[10];
        for(int index = 0; index < board.length; index++)
        {
            board[index] = ' ';
        }
        return  board;
    }
}