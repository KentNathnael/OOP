import java.util.Scanner;

/*
0 1 2
0 1 2
0 1 2
*/

public class Main {
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static Scanner obj = new Scanner(System.in); // object scanner

    static boolean win = false; //  sebuah flag

    public static void validate(){
        if(board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != '-') win = true; // kolom pertama horizontal
        if(board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != '-') win = true; // kolom pertama vertikal
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != '-') win = true; // horizontal ke arah kanan bawah
        if(board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != '-') win = true; // kolom 2 vertikal
        if(board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != '-') win = true; // kolom 3 veritkal
        if(board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] != '-') win = true; // horizontal kiri bawah
        if(board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != '-') win = true; // baris 2 horizontal
        if(board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != '-') win = true; // baris 3 horizontal
    }

    public static void printBoard(){ // print board
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void player1(){
        printBoard();
        int x1 = -1, y1 = -1;
        do{
            System.out.print("Player 1 : ");
            x1 = obj.nextInt();
            y1 = obj.nextInt();
        }while (x1 < 0 || x1 > 3 || y1 < 0 || y1 > 3 ); // validasi input supaya tidak out of bound
        if(board[y1][x1] != '-'){ //  validasi spot terisi
            System.out.println("Spot taken. Input different spot!!");
            player1();
        }
        else{
            board[y1][x1] = 'O';
        }
        validate(); // validasi cek tic tac toe
        if(win) {
            System.out.println("You win");
        }
    }

    public static void player2(){
        printBoard();
        int x2 = -1, y2 = -1;
        do{
            System.out.print("Player 2 : ");
            x2 = obj.nextInt();
            y2 = obj.nextInt();
        }while (x2 < 0 || x2 > 3 || y2 < 0 || y2 > 3 );
        if(board[y2][x2] != '-' ){
            System.out.println("Spot taken. Input different spot!!");
            player2();
        }
        else{
            board[y2][x2] = 'X';
        }
        validate();
        if(win) {
            System.out.println("You win");
        }
    }

    public static void main(String[] args) {
        while(!win){
            player1();
            if(win) break;
            player2();
            if(win) break;
        }
    }
}