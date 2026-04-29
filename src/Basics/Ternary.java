package Basics;

public class Ternary {
    public static void main(String[] args) {

        int imageSize = 10;
        int borderSite = 2;

        for(int i = 0; i < 10; i++){
            for(int j = 0 ; j < 10; j++){
                if(i > borderSite - 1 && i < 8 && j > borderSite - 1  && j < 8){
                    System.out.print("0");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();






        }

    }
}
