package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner scan = new Scanner(System.in);
        double biggestNumber = 0d;


        for (int i = 1; ; i++) {
            // i is counter (instances) >> input is demanded, givenNumber variable is assigned
            System.out.printf("Number " + i + ": ");
            double givenNumber = scan.nextDouble();

            // case: if negative number or zero is given in the first instance, error message is put out

            if (givenNumber <= 0 && i == 1) {
                System.out.println("No number entered.");
                return;
            }

            // case: givenNumber is bigger than biggestNumber

            else if (givenNumber > biggestNumber) {
                biggestNumber = givenNumber;
            }

            // if input is zero, the largest number will be put out

            else if (givenNumber <= 0) {
                System.out.println("The largest number is " + String.format("%.2f", biggestNumber));
                return;
            }
        }
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        // scanner reads number of lines
        System.out.print("n: ");
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        int i = 1;

        // if negative number or zero is entered, error message

        if (lines <= 0) {
            System.out.println("Invalid number!");
        }

        // otherwise print lines and rows accordingly
        else {
            // as long as printed lines havent reached wanted line keep printing
            for (int line = 1; line <= lines; line++) {

                // for each line repeat printing i until line reaches the same number as line

                for (int printedNumber = 1; printedNumber <= line; printedNumber++) {
                    System.out.print(i + " ");

                    // i++ continues adding 1 to number

                    i++;

                }

                // jump to next line when line is done

                System.out.println("");
            }
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here

        //define final variable value of 6
        final int finalLines = 6;

        for (int line = 1; line <= finalLines; line++) {

            // for loop concerning spaces (6 total - line 1 - 1)
            for (int spaces = finalLines - line - 1; spaces >= 0; spaces--) {
                System.out.print(" ");
            }

            // for loop concerning asterisks starting with 1 asterisk (line 1 x 2 - 1 = 1)
            for (int asterisks = 1; asterisks <= line * 2 - 1; asterisks++) {
                System.out.print("*");
            }

            //jump to the next line
            System.out.println();

        }
    }


    //todo Task 4
    public void printRhombus() {
        // input your solution here


    }

    //todo Task 5
    public void marks() {
        // input your solution here
        int currentGrade = 0;
        int sum = 0;
        int negativeGrades = 0;
        int i = 0;
        float average = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Mark " + (i + 1) + ": ");
            currentGrade = scan.nextInt();

            // end loop if zero is entered
            if (currentGrade == 0) {
                break;
            }
            // error message if grade under 0 or over 5 is entered
            else if (currentGrade < 0 || currentGrade > 5) {
                System.out.println("Invalid mark!");
            } else {
                // case: 5 is entered
                if (currentGrade == 5) {
                    sum = sum + currentGrade;
                    i++;
                    negativeGrades++;
                }
                // case: a number between 1-4 is entered
                else {
                    sum = sum + currentGrade;
                    i++;
                }
            }
            System.lineSeparator();

        }

        while (currentGrade != 0);


        //to fix failed test
        if (i == 0) {
            i++;
        }
        // typecasting counter i, calculating average
        average = sum / (float) i;

        System.out.println("Average: " + String.format("%.2f", average));
        System.out.println("Negative marks: " + negativeGrades);
    }

    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        // src https://www.efaculty.in/java-programs/happy-number-program-in-java/

        int n, r = 1, num, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        n = scan.nextInt();
        num = n;

        while (num > 9)

        {
            while (num > 0) {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1) {
            System.out.print("Happy number!");
        } else {
            System.out.print("Sad number!");

        }
        System.out.println("");
    }


    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}