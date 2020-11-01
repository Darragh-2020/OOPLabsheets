package Labsheet3;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output = "";

        Computer c1 = new Computer();

        output += "Calling the no-argument Computer constructor. " +
                  "The first Computer objects details are: \n\n" +
                  "Manufacturer: " + c1.manufacturer + "  Type: " + c1.type + "  Speed: " +
                  c1.speed + "  RAM: " + c1.RAM + "  Price: " + c1.price;

        Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are:\n\n" +
                "Manufacturer: " + c2.manufacturer + "  Type: " + c2.type + "  Speed: " +
                c2.speed + "  RAM: " + c2.RAM + "  Price: " + c2.price;

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
