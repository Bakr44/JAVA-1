
public class Main {
//    public static void main(String[] args) {
//
//        TicTacToe.emptyBoard();
//        TicTacToe.printBoard();
//
//        while (!TicTacToe.gameEnd()) {
//            TicTacToe.getPlayerInput();
//            TicTacToe.printBoard();
//            if (TicTacToe.gameEnd()) {
//                if (TicTacToe.winningSymbol == 'X') {
//                    System.out.println("Congratulations! You win!");
//                } else if (TicTacToe.winningSymbol == 'O') {
//                } else {
//                    if (TicTacToe.isDraw()) {
//                        System.out.println("Game over. It's a draw!");
//                    }
//                    break;
//                }
//                break;
//            }
//            int computerChoice = TicTacToe.getComputerChoice();
//            System.out.println("Computer chose " + computerChoice);
//            TicTacToe.printBoard();
//            if (TicTacToe.gameEnd()) {
//                System.out.println(TicTacToe.winningSymbol == 'X' ? "Congratulations! You won!" : "Sorry, the computer won.");
//                break;
//            }
//        }
//    }

    public static void main(String[] args) {
        TicTacToe.emptyBoard();
        TicTacToe.printBoard();

        while (!TicTacToe.gameEnd()) {
            TicTacToe.getPlayerInput();
            TicTacToe.printBoard();
            if (TicTacToe.gameEnd()) {
                System.out.println((TicTacToe.winningSymbol == 'X') ? "Congratulations! You win!" : "Game over. It's a draw!");
                break;
            }
            int computerChoice = TicTacToe.getComputerChoice();
            System.out.println("Computer chose " + computerChoice);
            TicTacToe.printBoard();
            if (TicTacToe.gameEnd()) {
                System.out.println(TicTacToe.winningSymbol == 'X' ? "Congratulations! You win!" : "Computer win!");
                break;
            }
        }
    }
}