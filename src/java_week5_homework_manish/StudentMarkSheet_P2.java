package java_week5_homework_manish;

import java.util.Scanner;

/**Rewrite the student mark sheet programme (From java-homework-week3
 programmes) using if else and while loop.
 */

public class StudentMarkSheet_P2 {

    public static void main(String[] args)
    {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name  :");
        String name = scanner.next();

        System.out.print("Enter Student Roll Number :");
        int rollNum = scanner.nextInt();

        System.out.print("Enter Marks of Subject Maths :");
        int mathsMarks = scanner.nextInt();

        while (mathsMarks < 0 || mathsMarks > 100)
        {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks:");
            mathsMarks = scanner.nextInt();
        }

        System.out.print("Enter Marks of Subject Science:");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks:");
            scienceMarks = scanner.nextInt();
        }

        System.out.print("Enter Marks of Subject English");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.print("Invalid input, Marks should between 0 to 100");
            System.out.print("Please enter correct marks:");
            englishMarks = scanner.nextInt();
        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scanner.close();
    }

    //calculating the sun
    public static int sum(int a, int b, int c)
    {
        return a + b + c;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks)
    {

        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result)
    {
        String grade = null;

        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "              |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "               |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                   |");
        System.out.println("|___________________________|");
    }


}