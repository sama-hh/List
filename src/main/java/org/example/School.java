package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List <Student> studentsList;

    public School() {
        studentsList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public Student getStudentById(String id) {
        for (Student student : studentsList) {
            if(student.getStudentId().equals(id)) {
                return student;
            };
        }
        return null;
    }

    public void removeStudent(Student student) {
        studentsList.remove(student);
    }

    public void printStudents() {
        for (Student student : studentsList) {
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
