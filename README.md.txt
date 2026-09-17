# Student Management System

## 1. Project Description

The Student Management System is a command-line based Java application developed to manage student records efficiently.

The system allows users to add, view, search, update, and delete student records. It can also calculate the class average and store student information in a file so that the data can be loaded when the application is run again.

## 2. Features

The application provides the following features:

* Add Student
* View All Students
* Search Student by ID
* Update Student Details
* Delete Student
* Calculate Class Average
* Save Student Data
* Load Previously Saved Student Data
* Exit the Application

## 3. Technologies Used

* **Programming Language:** Java
* **IDE:** Apache NetBeans
* **Collections:** ArrayList
* **File Handling:** FileReader, FileWriter, BufferedReader
* **Input Handling:** Scanner
* **Version Control:** Git and GitHub

## 4. Java Concepts Used

This project demonstrates the following Java concepts:

* Classes and Objects
* Constructors
* Encapsulation
* Inheritance
* Method Overriding
* Polymorphism
* ArrayList
* Methods
* Loops
* Conditional Statements
* Exception Handling
* File Handling

## 5. Project Structure

```text
StudentManagementSystem/
│
├── README.md
├── src/
│   └── studentmanagementsystem/
│       ├── Main.java
│       ├── Person.java
│       ├── Student.java
│       ├── StudentManager.java
│       └── FileHandler.java
│
├── data/
│   └── students.txt
│
└── nbproject/
```

### Description of Classes

**Main.java**
Contains the main method and provides the menu-driven command-line interface.

**Person.java**
Represents basic person information and demonstrates encapsulation.

**Student.java**
Extends the Person class and contains student-specific information such as student ID, branch, semester, and marks.

**StudentManager.java**
Manages student records using an ArrayList. It provides operations for adding, viewing, searching, updating, deleting students, and calculating the class average.

**FileHandler.java**
Handles saving and loading student information using file handling.

## 6. Requirements

To run this project, the following are required:

* Java Development Kit (JDK)
* Apache NetBeans IDE
* Command Prompt or Terminal for command-line execution

## 7. How to Run in Apache NetBeans

1. Open Apache NetBeans.
2. Open the `StudentManagementSystem` project.
3. Make sure all Java files are present under the `studentmanagementsystem` package.
4. Right-click the project.
5. Select **Run** or press **F6**.
6. The Student Management System menu will appear in the Output window.

## 8. How to Use the Application

After running the program, the following menu is displayed:

```text
=================================
     STUDENT MANAGEMENT SYSTEM
=================================
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Calculate Class Average
7. Save Data
8. Exit
=================================
Enter your choice:
```

Select the required option by entering its number.

### Adding a Student

Select option `1` and enter:

* Student ID
* Student Name
* Branch
* Semester
* Marks

The student will then be added to the student list.

### Viewing Students

Select option `2` to display all students currently stored in the system.

### Searching a Student

Select option `3` and enter the Student ID. The corresponding student details will be displayed if the student exists.

### Updating a Student

Select option `4`, enter the Student ID, and provide the updated student information.

### Deleting a Student

Select option `5` and enter the Student ID of the student to be deleted.

### Calculating Class Average

Select option `6`. The system calculates the average marks of all students currently stored.

### Saving Data

Select option `7` to save student records to:

```text
data/students.txt
```

The application also saves the data when the user exits.

## 9. Data Storage

Student records are stored in the following text file:

```text
data/students.txt
```

Each record is stored in the following format:

```text
Student ID,Name,Branch,Semester,Marks
```

Example:

```text
101,Unnati,ECE,6,88.5
102,Rahul,CSE,6,91.0
```

When the application starts, previously saved student records are loaded automatically.

## 10. Command-Line Execution

The project is designed as a command-line application and can be executed using the Java compiler.

From the project directory, the Java source files can be compiled using:

```text
javac -d out src/studentmanagementsystem/*.java
```

After compilation, run the application using:

```text
java -cp out studentmanagementsystem.Main
```

## 11. Sample Output

```text
=================================
     STUDENT MANAGEMENT SYSTEM
=================================
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Calculate Class Average
7. Save Data
8. Exit
=================================
Enter your choice: 1

Enter Student ID: 101
Enter Student Name: Unnati
Enter Branch: ECE
Enter Semester: 6
Enter Marks: 88.5

Student added successfully!
```

## 12. Conclusion

The Student Management System provides a simple and efficient way to maintain student records through a command-line interface.

The project applies important Java programming concepts such as object-oriented programming, inheritance, encapsulation, collections, exception handling, and file handling in a practical application.
