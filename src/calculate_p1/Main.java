package calculate_p1;

/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main extends Calculator{
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args)
    {
        String ch;
        do
        {
            System.out.print("Enter First Number: ");
            int a=sc.nextInt();

            System.out.print("Enter Second Number: ");
            int b=sc.nextInt();

            System.out.print("Please enter one of symbol +,-,*, /: ");
            char symbol = sc.next().charAt(0);

            Main obj = new Main();
            obj.calculatorResult(a,b,symbol);

            System.out.print("Would you like to do more calculation Please enter Y or N : " );
            ch = sc.next();
        } while(ch.equalsIgnoreCase("Y"));
    }
}
