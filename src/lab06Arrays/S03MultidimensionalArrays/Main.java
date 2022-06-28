package lab06Arrays.S03MultidimensionalArrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};

        /*int[][] array2 = new int[2][2];
        array2[0][0] = 10;
        array2[0][1] = 20;
        array2[1][0] = 30;
        array2[1][1] = 30;*/

        int[][] array3 = {{10, 20}, {30, 40}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("i = " + i + ", j = " + j + " Deger : " + array3[i][j]);
            }
        }

    }
}
