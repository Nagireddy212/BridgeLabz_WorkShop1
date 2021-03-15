import java.util.Scanner;

<<<<<<< HEAD
public class TacToe {
    static char[] board = new char[10];
    public static char player1;
    public static char computer;

    public static void makeEmpty() {
        for (int index = 0; index < board.length; index++) {
            board[index] = ' ';
=======
public class Tic_Toc_Game {
    // UC-1
    static char[] board = new char[10];
    public static char player;
    public static char computer;

    public static void makeEmpty() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
>>>>>>> UC2_Player_Selection
        }
    }

    public static void playerSelect() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Symbol you choose to with (X/O): ");
        String choice = scan.next();
        switch(choice) {
            case "X":
<<<<<<< HEAD
                player1 = 'X';
                computer = 'O';
                break;
            case "O":
                player1 = 'O';
                computer = 'X';
                break;
            default:
                System.out.println("Invalid choice selected");
=======
                player = 'X';
                computer = 'O';
                break;
            case "O":
                player = 'O';
                computer = 'X';
                break;
            default:
                System.out.println("Invalid choice");
>>>>>>> UC2_Player_Selection
                break;
        }
    }

    public static void main(String[] args) {
        makeEmpty();
        playerSelect();
    }
}
