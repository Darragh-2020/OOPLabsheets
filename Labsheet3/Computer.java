package Labsheet3.exercise2;

public class Computer {
    String manufacturer;
    String type;
    double speed;
    int RAM;
    double price;


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Computer() {
        manufacturer = "Not available";
        type = "Not available";
        speed = 0;
        RAM = 0;
        price = 0;

    }

    public Computer(String manufacturer, String type, double speed, int RAM, double price) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.speed = speed;
        this.RAM = RAM;
        this.price = price;
    }
}





