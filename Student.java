package studentmanagementsystem;

public class Student extends Person {

    private int studentId;
    private String branch;
    private int semester;
    private double marks;

    // Constructor
    public Student(int studentId, String name, String branch, int semester, double marks) {
        super(name);
        this.studentId = studentId;
        this.branch = branch;
        this.semester = semester;
        this.marks = marks;
    }

    // Getter and Setter for Student ID
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Getter and Setter for Branch
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Getter and Setter for Semester
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    // Getter and Setter for Marks
    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Overriding displayDetails()
    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + getName());
        System.out.println("Branch: " + branch);
        System.out.println("Semester: " + semester);
        System.out.println("Marks: " + marks);
    }
}