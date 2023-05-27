package Dsa_Bootcamp_kunal.Ass_1_flow_of_program;


import java.util.Scanner;

//Take 2 numbers as inputs and find their HCF and LCM.
public class LcmAndHcf {
    public static void main(String[] args) {
        int lcm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :- ");
        int num2 = sc.nextInt();
        for ( lcm=1;lcm<=(num1*num2);lcm++){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                System.out.println("Lcm is :- " + lcm);
                break;
            }

        }
    }
}
