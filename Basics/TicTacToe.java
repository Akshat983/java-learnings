package JavaByKK;
import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] game = new char[3][3];
        //initializing default inputs
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game[i][j] = ' ';
            }
        }
        print(game);
        System.out.println("The game begins!!");

        int c = 0;
        char[] players = {'X', '0'};
        //game
        while (true) {
            //identify which player is playing
            char player = players[c % 2];
            System.out.print("Player " + player + " enter index to play : ");
            int row = in.nextInt();
            int column = in.nextInt();

            //checking for invalid input of index
            if ((row > 2 || column > 2) || !isEmpty(game, row, column)) {
                System.out.println("Invalid Index");
                continue;
            }

            game[row][column] = player;
            print(game);

            //check if the current player hs won
            if(hasWon(game, player)) {
                System.out.println("Player " + player + " has won!!");
                break;
            }
            //check if game has ended in a draw
            if(isFull(game)) {
                System.out.println("No one won!!");
                break;
            }
            c++;
        }
    }

    //print array
    static void print(char[][] ar) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ar[i][j]);
                if(j<2)
                    System.out.print(" | ");
            }
            System.out.println();
            if(i<2)
                System.out.println("__|___|___");
        }
    }

    //check for empty place
    static boolean isEmpty(char[][] ar, int row, int column) {
            return (ar[row][column] == ' ');
    }

    //check if player has won
    static boolean hasWon(char[][] ar, char player) {
        int c = 0;
        for (int i = 0; i < 3; i++) {
            if(ar[i][0] == player && ar[i][1] == player && ar[i][2] == player)
                return true;
            if(ar[0][i] == player && ar[1][i] == player && ar[2][i] == player)
                return true;
        }
        if(ar[0][0] == player && ar[1][1] == player && ar[2][2] == player)
            return true;
        if(ar[0][2] == player && ar[1][1] == player && ar[2][0] == player)
            return true;
        return false;
    }

    //check if array is full and game is drawn
    static boolean isFull(char[][] ar) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(ar[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
}
