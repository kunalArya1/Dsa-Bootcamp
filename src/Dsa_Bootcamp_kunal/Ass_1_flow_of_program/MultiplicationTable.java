package Dsa_Bootcamp_kunal.Ass_1_flow_of_program;
import java.util.Scanner;


//Input a year and find whether it is a leap year or not.
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " +(num*i));
        }

    }
}
