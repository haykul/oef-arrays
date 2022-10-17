package be.intecbrussel;

public class Oef03 {

    public static void main(String[] args) {

        int[] arr = {10, 19, 14, 23, 15, 0, 9};

        for (int outer = 0; outer < arr.length; outer++) {

            int inner;

            for (inner = outer + 1; inner < arr.length; inner++) {

                if (arr[outer] <= arr[inner]) {
                    break;

                }
            }

            if (inner == arr.length) {
                System.out.print(arr[outer] + " ");
            }

        }

    }

}
