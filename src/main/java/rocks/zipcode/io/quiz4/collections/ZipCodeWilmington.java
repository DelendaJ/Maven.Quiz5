package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private List<Student> aStudentList = new ArrayList<>();

    public void enroll(Student student) {
        aStudentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return (aStudentList.add(student));

    }

    public void lecture(double numberOfHours) {
        for (Student student : aStudentList) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {

        Map<Student, Double> aMap = new HashMap<>();
        for (Student student : aStudentList) {
            aMap.putIfAbsent(student, student.getTotalStudyTime());
        }
        return aMap;

    }
}
