/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafirst;

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
    }

}
