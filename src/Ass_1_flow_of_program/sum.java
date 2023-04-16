package Ass_1_flow_of_program;

import java.util.Scanner;

//Take two numbers and print the sum of both.
public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number :- ");
        int fNum = in.nextInt();
        System.out.print("Enter second number :- ");
        int sNum = in.nextInt();
        System.out.println("Sum of given numbers is :- "+(fNum+sNum));
    }
}
