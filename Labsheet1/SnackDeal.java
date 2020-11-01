//SnackDeal.java
/*This program asks the user to input their details and their snack choices and calculates the price of their lunch*/

package Labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {

      String  name, course;
      int snacks;

      name = JOptionPane.showInputDialog("Please enter your name: ");
      course = JOptionPane.showInputDialog("Please enter your course: ");
      snacks = Integer.parseInt(JOptionPane.showInputDialog("How many snack would you like?: "));

      JOptionPane.showMessageDialog(null,"Name: " + name +
                                         "\nCourse: " + course +
                                         "\nCost: €" + (snacks*2),
                                         "Receipt" ,JOptionPane.INFORMATION_MESSAGE);

      System.exit(0);
    }
 }