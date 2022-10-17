package be.intecbrussel;

import java.util.Arrays;

public class Oef02 {

    public static void main(String[] args) {

        int[] myArr = {10, 20, 55, 30, 100};

        Arrays.sort(myArr);

        int index = myArr.length - 1;

        while (myArr[index] == myArr[myArr.length - 1]) {

            index--;

        }

        System.out.println("Second largest number is: " + myArr[index]);

    }

}
