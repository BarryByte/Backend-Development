package tictactoe;

import java.util.*;

public class main {
    
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
            char sym;
            int countOfMoves = 0;
            //accoring to the player turn we will ask
            //the outer whileloop will make the gameplay continue till either player win
            // the inner whileoop will continue until you are taking the input
            int r;
            int c;
            while(true){
                if(turn){
                    System.out.println("Player 1, please make your turn :");
                } else{
                    System.out.println("Player 2, please make your turn :");
                }
                
                if(turn){
                    sym ='X';
                } else{
                    sym = 'O';
                }

                System.out.println("please input the row and col");
                r = sc.nextInt();
                // System.out.println("Please input the col");
                c = sc.nextInt();
    
                if(r<0 || r>=n || c<0 || c>=n){
                    System.out.println("invalid move! please try again");
                } else if(board[r][c] != '-'){
                    System.out.println("This cell is already occupied!");
                } else {
                    board[r][c] = sym;
                    countOfMoves++;
                    break; // work of this loop is only to obtain the valid input
                    // as soon as the work is complete the loop breaks and checkwinner function check the board...
                }
            }
            // if(checkWinner(board , sym)){
            //     System.out.println("Winner(n^2) is " + sym);
            //     break;
            // } else if (countOfMoves == 9){
            //     System.out.println("Draw(n^2)");
            //     break;
            // }

            if(checkWinner_n(board, sym, r, c)){
                System.out.println("Winner(n) is " + sym);
                break;
            } else if (countOfMoves == 9){
                System.out.println("Draw(n)");
                break;
            }
            
            
            displayBoard(board);
            turn =! turn;
        }
       
        
        
    }
    // why static are used ? part of different lecture.

    /*optimize checkWinner function  -> write all the big-O notation variation
        n^3 -> n^2 -> n -> 1 `x
    */ 
    public static boolean checkWinner(char[][] board, char sym){
        //time complexity -> O(n^2)
        for(int i = 0 ; i<board.length; i++){
            if(board[i][0] == sym && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return true;
            } else if(board[0][i] == sym && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                return true;
            }
        }
        if(board[0][0] == sym && board[1][1] == sym && board[2][2] ==sym){
            return true;
        }
        if(board[0][2] == sym && board[1][1] == sym && board[2][0] ==sym){
            return true;
        }
        return false;
    }
    //asdasd
    public static boolean checkWinner_n(char[][] board, char sym, int r, int c){
        boolean flag = true;

        for(int i = 0 ; i<board.length-1 ; i++){
            if(board[r][i] != board[r][i+1]){
                flag = false;
                break;
            }
        }
        if(flag == true) return true;

        for(int i = 0 ; i<board.length-1 ; i++){
            if(board[i][c] != board[i+1][c]){
                flag = false;
                break;
            }
        }
        if(flag == true) return true;

        if(board[0][0] == sym && board[1][1] == sym && board[2][2] ==sym){
            return true;
        }
        if(board[0][2] == sym && board[1][1] == sym && board[2][0] ==sym){
            return true;
        }
        
        return false;
    }
    public static void displayBoard(char[][] board){
        for(int i = 0; i<board.length ;i++){
            for (int j = 0; j <board.length; j++) {
                System.out.print(board[i][j]);
                
            }
            System.out.println();
        }
    }
}
    
