/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafirst;

import java.util.Scanner;

/**
 *
 * @author Enon Raihan
 */
public class JavaFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NewClass newClass = new NewClass();
        newClass.getMahfuj();
        newClass.setMahfuj("Joy Mukul", "20");

        int n1 = 225;
        int n2 = 115;
        int sum;

        sum = n1 * n2;
        int name = sum + Integer.parseInt(newClass.joy);

        System.out.println("The sum of numbers is: " + sum + "name" + name);

       /* Scanner reader = new Scanner(System.in);

        int num;
        // for loop  
        for (int i = 0; i >= 0; ++i) {
            System.out.print("Enter a number: ");
            num = reader.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
            if (num == 10) {
                break;
            }
        }*/
    }

}
