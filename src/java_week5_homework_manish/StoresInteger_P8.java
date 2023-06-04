package java_week5_homework_manish;


import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class StoresInteger_P8 {

    public static void main(String[] args)
    {
        Store();

    }

    public static void Store()
    {
        HashSet<Integer> num = new HashSet();
        num.add(4);
        num.add(7);
        num.add(8);

        for(int i = 1; i <= 10; i++)
        {
            if(num.contains(i))
            {
                System.out.println(i + " was found in the set.");
            }
            else
            {
                System.out.println(i + " was not found in the set.");
            }
        }

    }
}