public class Hello1 {
    public static void main(String[] args) {
        int size = 7;
        String[][] canvas = new String[size][size];

        canvasPrint(canvas);

        }

        public static void canvasPrint (String [][] canvas ){
            for(int i = 0; i < canvas.length; i++){
                for(int j = 0; j < canvas[i].length; j++){
                    if(i == 0 || i == 7 - 1 || j == 0 || j == 7 - 1 ){
                        canvas[i][j] = "*";

                    }else if(i == j){
                        canvas[i][j] = "x";



                    } else {
                        canvas[i][j] = ".";
                    }


                    System.out.print(canvas[i][j]);

                }
                System.out.println();

        }



    }
}
