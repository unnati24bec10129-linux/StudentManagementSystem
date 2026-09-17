package studentmanagementsystem;

import java.util.ArrayList;

public class StudentManager {

    // List to store all students
    private final ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n===== ALL STUDENTS =====");

        for (Student student : students) {
            student.displayDetails();
            System.out.println("------------------------");
        }
    }

    // Search student by ID
    public void searchStudent(int studentId) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {
                System.out.println("\n===== STUDENT FOUND =====");
                student.displayDetails();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update student details
    public void updateStudent(int studentId, String name,
                              String branch, int semester,
                              double marks) {

        for (Student student : students) {

            if (student.getStudentId() == studentId) {

                student.setName(name);
                student.setBranch(branch);
                student.setSemester(semester);
                student.setMarks(marks);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete student
    public void deleteStudent(int studentId) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Calculate class average
    public void calculateAverage() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        double total = 0;

        for (Student student : students) {
            total = total + student.getMarks();
        }

        double average = total / students.size();

        System.out.println("Class Average: " + average);
    }

    // Get student list for FileHandler
    public ArrayList<Student> getStudents() {
        return students;
    }

    // Add loaded student from file
    public void addLoadedStudent(Student student) {
        students.add(student);
    }
}