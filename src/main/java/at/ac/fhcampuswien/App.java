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

        // define final variable value of 6; finals sollen mit capslock benannt werden
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
        // request height and character as input
        Scanner scan = new Scanner(System.in);
        System.out.print("h: ");
        int height = scan.nextInt();

        System.out.print("c: ");
        char character = scan.next().charAt(0);

        // error message if even number is entered

        if (height % 2 == 0){
            System.out.println("Invalid number!");
            return;
        }

        // top half of the rhombus,

        int i,j,k;
        for (i = 0; i < (height/2) + 1; i++) {

            //for loop for spaces

            for (j = 0 ; j < (height-1)/ 2-i; j++) {
                System.out.print(" ");
            }

            //print given character and ascii characters next to it
            for (j = i; j > 0; j--) {
                System.out.print((char)(character - j));
            }
            System.out.print(character);

            for (k = 1; k <= i ; k++) {
                System.out.print((char)(character - k));
            }
            System.out.println();
        }

        //bottom half of the rhombus

        for (i = (height/2)-1; i >= 0; i--) {

            for (j = 0; j < (height-1) / 2 - i ; j++) {

                System.out.print(" ");
            }

            for (j = i; j > 0; j--) {
                System.out.print((char)(character - j));
            }
            System.out.print(character);

            for (k = 1; k <= i ; k++) {
                System.out.print((char)(character-k));
            }
            System.out.println();
        }

    }

    //todo Task 5
    public void marks() {
        // input your solution here

        int currentGrade = 0;
        int sum = 0;
        int negativeGrades = 0;

        // int i for instances, counter
        int i = 0;
        float average = 0;

        // input is assigned to variable currentGrade
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Mark " + (i + 1) + ": ");
            currentGrade = scan.nextInt();

            // case: end loop if zero is entered
            if (currentGrade == 0) {
                break;
            }

            // error message if grade under 0 or over 5 is entered
            else if (currentGrade < 0 || currentGrade > 5) {
                System.out.println("Invalid mark!");

            }

            else {
                // case: 5 is entered

                if (currentGrade == 5) {
                    sum = sum + currentGrade;
                    i++;
                    negativeGrades++;
                }

                // case: a number between 1-4 is entered, current grade is added to sum

                else {
                    sum = sum + currentGrade;
                    i++;
                }
            }
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
        // source: https://www.efaculty.in/java-programs/happy-number-program-in-java/

        int n, r = 1, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        n = scan.nextInt();

        while (n >= 10)

        {
            while (n > 0) {
                // calculate remainder by dividing the given number with 10
                r = n % 10;
                // calculate square of remaining value and add to variable sum
                sum = sum + (r * r);
                // divide number by 10
                n = n / 10;
            }
            // if no digit remaining continue with sum
            n = sum;
            sum = 0;
        }

        // output according to result -> 1 defines a happy number

        if (n == 1) {
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