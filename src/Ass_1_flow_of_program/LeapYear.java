package Ass_1_flow_of_program;

import java.util.Scanner;

//Input a year and find whether it is a leap year or not.
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year :- ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Given year is leap year ");
        }else {
            System.out.println("Given year is not leap year");
        }
    }
}
