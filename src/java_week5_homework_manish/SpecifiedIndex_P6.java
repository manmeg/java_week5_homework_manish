package java_week5_homework_manish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class SpecifiedIndex_P6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        element();

    }
    public static void element()
    {
        List<String> color = new ArrayList<String>();
        color.add("John");
        color.add("Maish");
        color.add("Adam");
        color.add("Hello");
        color.add("Paned");
        color.add("Bravp");


        System.out.println(color);

        System.out.println("Please Enter the number 0 to 5 : ");
        String element = color.get(sc.nextInt());
        System.out.println("First element: "+element);

        System.out.println("Please Enter the number 0 to 5 : ");
        element = color.get(sc.nextInt());
        System.out.println("Third element: "+element);
    }

}