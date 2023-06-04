package java_week5_homework_manish;


import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */

public class ReverseArray_P3 {

    public static void main(String[] args)
    {
        value();
    }
    public static void value()
    {
        int[] my_array1 = {
                1935, 2035, 1821, 1356, 2023,
                1158, 2958, 1054, 1472, 2565,
        };
        System.out.println("Original array : "+ Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length / 2; i++)
        {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));
    }

}