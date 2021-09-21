package org.sandeep.calculator;

import org.sandeep.array.Addition;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        System.out.println("Welcome user");
        System.out.println("Please enter first digit");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter second digit");
        int b = sc.nextInt();
        System.out.println("Choose an operation : ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int option = sc.nextInt();
        String str = "Result : ";
        switch (option){
            case 1 : Addition addition = new Addition();
                     System.out.println(str + addition.operate(a,b));
                     break;
            case 2 : Subtraction subtraction = new Subtraction();
                     System.out.println(str + subtraction.operate(a,b));
                     break;
            case 3 : Multiplication multiplication = new Multiplication();
                     System.out.println(str + multiplication.operate(a,b));
                     break;
            case 4 : Divison divison = new Divison();
                     System.out.println(str + divison.operate(a,b));
                     break;
            default:
                System.out.println("Invalid option choosen");
                break;
        }
    }
}
