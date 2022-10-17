package be.intecbrussel;

import java.util.Arrays;

public class Oef01 {

    public static void main(String[] args) {

        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int[] newArray = new int[10];

        System.out.println("original Array : " + Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }

        System.out.println("New Array: " + Arrays.toString(newArray));

    }

}
