package tictactoe;

import java.util.*;

public class main {
    public static void displayBoard(char[][] board){
        for(int i = 0; i<board.length ;i++){
            for (int j = 0; j <board.length; j++) {
                System.out.print(board[i][j]);
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the name of Player 1 :");
        String p1 = sc.nextLine();

        System.out.println("Please Enter the name of Player 2 :");
        String p2 = sc.nextLine();

        //in future, we can have more than 2 player game so we have to change the input code suitable for more player.

        boolean turn = true;
        for(int i = 0; i<n ;i++){
            for (int j = 0; j < n; j++) {
               board[i][j] = '-';
                
            }
        }
        displayBoard(board);
        while(true){
            
            //accoring to the player turn we will ask
            //the outer whileloop will make the gameplay continue till rither player win
            // the inner whileoop will continue until you are taking the input
            while(true){
                if(turn){
                    System.out.println("Player 1, please make your turn :");
                } else{
                    System.out.println("Player 2, please make your turn :");
                }
                char sym;
                if(turn){
                    sym ='X';
                } else{
                    sym = 'O';
                }

                System.out.println("please input the row");
                int r = sc.nextInt();
                System.out.println("Please input the col");
                int c = sc.nextInt();
    
                if(r<0 || r>=n || c<0 || c>=n){
                    System.out.println("invalid movve! please try again");
                } else if(board[r][c] != '-'){
                    System.out.println("This cell is already occupied!");
                } else {
                    board[r][c] = sym;
                    break;
                }
            }
            if(checkWinner(board , sym)){
                System.out.println("Winner is " + sym);
                break;
            } else if (countOfMoves == 9){
                System.out.println("Draw");
                break;
            }
            

            turn =! turn;
        }
        
        
    }
    // why static are used ? part of different lecture.

    /*optimize checkWinner function  -> write all the big-O notation variation
        n^3 -> n^2 -> n -> 1 `x
    */ 
    public static boolean checkWinner(char[][] board, char sym){
        
        for(int i = 0 ; i<board.length;i++){
            if(board[i][0] == sym && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return true;
            } else if(board[0][i] == sym && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                return true;
            }
            //diagonal HW:
        }
    }
}
    
