package ro.itschool.mvnbase.curs22;

import java.util.List;

public class MethodRefs {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ion", "Math", 10, "A"),
                new Student("Vasile", null, 8, "B"),
                new Student("Eugen", "Spanish", 4, "C"),
                new Student("Laslo", "Spanish", 6, "A"),
                new Student("Tuse", "English", 6, "C"),
                new Student("Tuse", "English", 10, "C")
        );

        StudentService studentService = new StudentService(students);

        System.out.println(studentService.checkFailedAnyMatch());

        System.out.println(studentService.averageGradeForCourse("Spanish"));

        System.out.println(studentService.maxGradeForGroup("A"));

        System.out.println(studentService.allDistinctGrades());

        System.out.println(studentService.mapNameToGrade());
    }
}
