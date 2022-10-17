package be.intecbrussel;

public class twoDArray {

    public static void main(String[] args) {

        // 1D
        int[] myArr = new int[5];
        myArr[0] = 10;

        // 2D array
        int[][] my2DArr = new int[5][10];
        my2DArr[0][0] = 1;
        my2DArr[0][1] = 2;
        my2DArr[2][0] = 100;

        System.out.println(my2DArr[0][1]);

    }

}
