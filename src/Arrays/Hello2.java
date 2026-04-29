package Arrays;

public class Hello2 {
    public static void main(String[] args) {
        int size = 6;
        String [][] board = new String [size][size];

        boardPrint(board);

    }

    public static void boardPrint (String [][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((i + j) % 2 == 0){
                    System.out.print("W" + " ");

                }else{
                    System.out.print("B" + " ");
                }

            }
            System.out.println();

        }

    }
}
