package studentmanagementsystem;

public class Person {

    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
    }
}