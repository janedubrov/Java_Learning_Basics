package Arrays_and_cycles;

public class fourteen {
    public static void main(String[] args) {

        String[][] house = new String[5][5];
        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house[i].length; j++) {
                house[i][j] = ".";
            }

        }
        house[2][3] = "x";
        houseMet(house);

    }
    public static void houseMet(String[][] home) {
        for (int i = 0; i < home.length; i++) {
            for (int j = 0; j < home[i].length; j++) {
                System.out.print(home[i][j] + " ");
            }
            System.out.println();
        }
    }
}