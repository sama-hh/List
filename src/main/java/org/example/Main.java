package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "1");
        Student student2 = new Student("Anna", "Swift", "2");
        Student student3 = new Student("Mina", "Kaya", "3");
        School school = new School();

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        System.out.println("getStudentById = " + school.getStudentById("1"));
        System.out.println("Students: ");

        school.printStudents();
        school.removeStudent(student3);

        System.out.println("Students after removing one");

        school.printStudents();

        /// Courses

        Course course1 = new Course("Math", "John Clark", "203");
        Course course2 = new Course("English", "Bella Spector", "202");

        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course2);

        System.out.println("Student1 courses");

        List<Course> student1Courses = school.getStudentCourses("1");
        if (!student1Courses.isEmpty()) {
            for (Course c : student1Courses) {
                System.out.println(c);
            }
        }
        else System.out.println("not found");

        /// Sack
//        System.out.println("Sack");
//
//        Sack sack = new Sack();
//
//        sack.add(23);
//        sack.add(123);
//        sack.add(43);
//        sack.add(454);
//        sack.add(65);
//        sack.add(23);
//        sack.add(34);
//        sack.add(435);
//
//        sack.print();
//        System.out.println("get = " + sack.get(1));
//        System.out.println("size = " + sack.size());
//        sack.removeLastElement();
//        sack.print();
//        sack.removeLastElement();
//        sack.removeLastElement();
//        sack.print();
//        System.out.println("size = " + sack.size());
//
//        sack.add(435);
//        sack.print();
//        sack.removeByIndex(1);
//        sack.add(234);
//
//        sack.print();

    }
}