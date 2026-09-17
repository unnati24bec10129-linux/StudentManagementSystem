package studentmanagementsystem;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    // File where student data will be stored
    private static final String FILE_NAME = "data/students.txt";

    // Save students to file
    public static void saveStudents(ArrayList<Student> students) {

        try {

            // Create data folder if it does not exist
            File folder = new File("data");

            if (!folder.exists()) {
                folder.mkdir();
            }

            // Create file writer
            FileWriter writer = new FileWriter(FILE_NAME);

            for (Student student : students) {

                writer.write(
                    student.getStudentId() + "," +
                    student.getName() + "," +
                    student.getBranch() + "," +
                    student.getSemester() + "," +
                    student.getMarks() + "\n"
                );
            }

            writer.close();

            System.out.println("Student data saved successfully!");

        } catch (IOException e) {

            System.out.println("Error while saving student data.");
        }
    }

    // Load students from file
    public static void loadStudents(StudentManager manager) {

        File file = new File(FILE_NAME);

        // If file does not exist, there is nothing to load
        if (!file.exists()) {
            return;
        }

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                if (data.length == 5) {

                    int studentId = Integer.parseInt(data[0]);
                    String name = data[1];
                    String branch = data[2];
                    int semester = Integer.parseInt(data[3]);
                    double marks = Double.parseDouble(data[4]);

                    Student student = new Student(
                            studentId,
                            name,
                            branch,
                            semester,
                            marks
                    );

                    manager.addLoadedStudent(student);
                }
            }

            reader.close();

        } catch (IOException | NumberFormatException e) {

            System.out.println("Error while loading student data.");
        }
    }
}