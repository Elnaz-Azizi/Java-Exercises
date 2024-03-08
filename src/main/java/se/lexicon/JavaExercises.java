package se.lexicon;

import java.util.Scanner;

public class JavaExercises {


    public static void main(String[] args) {
        // ClassName.methodName
        ex6();

    } // main


    public static void ex1() {
        //exercise1
        System.out.println("Hello");
        System.out.println("Elnaz");
    }

    public static void ex2() {
        //exercise2
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A YEAR:");
        int year = sc.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void ex3() {
        System.out.println("45+11=56");
        System.out.println("12*4=48");
        System.out.println("24/6=4");
        System.out.println("55-12=43");
    }

    public static void ex4() {
        System.out.println("(23+11+77)/3=37");
    }

    public static void ex5() {
        System.out.println("Input your name:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.println("Hello" + username + "!");
        sc.close();
    }

    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter a number:");
        double num2 = sc.nextDouble();
        System.out.println("Sum Result = " + (num1 + num2));
        System.out.println("Multiplication Result = " + (num1 * num2));
        System.out.println("Division Result = " + (num1 / num2));
        System.out.println("Subtraction Result = " + (num1 - num2));
    }
} // class