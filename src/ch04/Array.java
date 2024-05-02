package ch04;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array2 = new int[]{1,3,5,7,9};
        int[] array3 = new int[5];

        array3[0] = 0;
        array3[1] = 2;
        array3[2] = 4;
        array3[3] = 6;
        array3[4] = 8;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        int[] myArray = {1,4,2,5,3};
        myArray[1] = 7;
        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray[2]);
        myArray[4] = myArray[2];
        System.out.println(Arrays.toString(myArray));
    }
}
/*
[1, 2, 3, 4, 5]
[1, 3, 5, 7, 9]
[0, 2, 4, 6, 8]
[1, 7, 2, 5, 3]
2
[1, 7, 2, 5, 2]
 */