package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private Map<String, Student> studentsMap;

    public School() {
        studentsMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentsMap.put(student.getStudentId(),student);
    }

    public Student getStudentById(String id) {
        return studentsMap.get(id);
    }

    public void removeStudent(Student student) {
        studentsMap.remove(student.getStudentId());
    }

    public void printStudents() {
        for (Student student : studentsMap.values()) {
            System.out.println(student);
        }
    }

    public List<Course> getStudentCourses(String studentId) {
        Student student = getStudentById(studentId);
        if(student != null) {
            return student.getCourses();
        }
        return null;
    }
}
