package java_week5_homework_manish;


import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class SomeColors_P4 {

    public static void main(String[] args)
    {
        loop();

    }
    public static void loop()
    {
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);


        for (String color : colors) {
            System.out.println(color);
        }


    }
}