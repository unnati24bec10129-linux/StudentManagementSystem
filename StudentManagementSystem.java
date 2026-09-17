package studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        // Load previously saved student data
        FileHandler.loadStudents(manager);

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Calculate Class Average");
            System.out.println("7. Save Data");
            System.out.println("8. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    // Add Student

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Enter Semester: ");
                    int semester = sc.nextInt();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(
                            id,
                            name,
                            branch,
                            semester,
                            marks
                    );

                    manager.addStudent(student);

                    break;

                case 2:
                    // View Students

                    manager.viewStudents();

                    break;

                case 3:
                    // Search Student

                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    manager.searchStudent(searchId);

                    break;

                case 4:
                    // Update Student

                    System.out.print("Enter Student ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Branch: ");
                    String newBranch = sc.nextLine();

                    System.out.print("Enter New Semester: ");
                    int newSemester = sc.nextInt();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    manager.updateStudent(
                            updateId,
                            newName,
                            newBranch,
                            newSemester,
                            newMarks
                    );

                    break;

                case 5:
                    // Delete Student

                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = sc.nextInt();

                    manager.deleteStudent(deleteId);

                    break;

                case 6:
                    // Calculate Average

                    manager.calculateAverage();

                    break;

                case 7:
                    // Save Data

                    FileHandler.saveStudents(manager.getStudents());

                    break;

                case 8:
                    // Exit

                    // Save automatically before exiting
                    FileHandler.saveStudents(manager.getStudents());

                    System.out.println("Thank you for using Student Management System!");
                    System.out.println("Program closed.");

                    break;

                default:

                    System.out.println("Invalid choice! Please enter 1-8.");
            }

        } while (choice != 8);

        sc.close();
    }
}