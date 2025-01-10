import java.util.Arrays;

public class TwoDArray {

    public static void main(String args[]) {

        // Creating, accessing and changing 2D Arrays

        int[][] num = {{0, 1, 2}, {3, 2, 1}, {4, 3, 1}};

        System.out.println(num[1][0]);

        num[1][0] = 7;

        System.out.println(num[1][0]);

        int[][] second = new int[3][3];

        System.out.println(second[0][1]);

        second[0][0] = 3;
        second[0][1] = 5;
        second[0][2] = 4;
        second[1][0] = 1;
        second[1][1] = 2;
        second[1][2] = 6;
        second[2][0] = 9;
        second[2][1] = 14;
        second[2][2] = 18;

        System.out.println(second[0][1]);

        // If I don't use Arrays.toString, it will print the memory addresses [I@15db9742]
        for (int[] print : second) {
            System.out.println(Arrays.toString(print));
        }

        // Row Major Order

        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < second[0].length; j++) {
                System.out.println(second[i][j]);
            }
        }

        // Columns Row Order

        for (int i = 0; i < second[0].length; i++) {
            for (int j = 0; j < second.length; j++) {
                System.out.println(second[j][i]);
            }
        }


    }

}
