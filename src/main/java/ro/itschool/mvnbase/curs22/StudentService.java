package ro.itschool.mvnbase.curs22;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class StudentService {
    private List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getTheAverageGrade() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0d);
    }

    public boolean checkFailedAnyMatch() {
        return students.stream()
                .anyMatch(student -> student.getGrade() < 5);
    }

    public boolean checkFailedAnyMatchMR() { //Method Reference
        return students.stream()
                .mapToInt(Student::getGrade)
                .anyMatch(grade -> grade < 5);
    }

    public boolean checkFailedAllMatch() {
        return students.stream()
                .allMatch(student -> student.getGrade() > 4);
    }

    public boolean checkFailedMin() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .min()
                .orElse(5) <= 4;
    }

    public boolean checkFailedFilter() {
        return students.stream()
                .filter(student -> student.getGrade() < 4)
                .findAny()
                .isPresent();
    }

    public boolean checkFailedFilter2() {
        return students.stream()
                .filter(student -> student.getGrade() < 4)
                .findFirst()
                .isPresent();
    }

    public double averageGradeForCourse(String course) {
        return students.stream()
                .filter(student -> course.equals(student.getCourse()))
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0d);
    }

    public int maxGradeForGroup(String group) {
        return students.stream()
                .filter(student -> group.equals(student.getGroup()))
                .mapToInt(Student::getGrade)
                .max()
                .orElse(0);
    }

    public List<Integer> allDistinctGrades() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .distinct()
                .boxed()
                .collect(toList());
    }

//    public int reducedHighestGrade() {
//        return students.stream()
//                .mapToInt(Student::getGrade)
//                .reduce()
//    }

    public Map<String, Integer> mapNameToGrade() {
        return students.stream()
                .collect(toMap(Student::getName, Student::getGrade, (oldGrade, newGrade) -> (oldGrade + newGrade) / 2));
    }

    public Map<String, List<Integer>> mapNametoGradesList() {
        return students.stream()
                .collect(toMap(Student::getName, student -> List.of(student.getGrade(), (l1,l2)-> merge(l1,l2))));
    }

    private List<Integer> merge(List<Integer> l1, List<Integer> l2) {
        l1.addAll(l2)
        return l1;
    }
}
