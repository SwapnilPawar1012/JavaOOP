package OOPs;
// 21. Write a Java program to create a class called "Student" with a name, grade, and course attributes, and methods to add and remove courses.

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    double grade;
    List<String> courses;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " course added.");
    }

    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " course removed successfully.");
        } else {
            System.out.println("course not found!");
        }
    }

    public void displayCourses() {
        System.out.println("courses of " + name + ": ");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class Lab_23 {
    public static void main(String arg[]) {
        Student student = new Student("Swapnil", 8.8);
        student.addCourse("C");
        student.addCourse("C++");
        student.addCourse("Java");
        student.addCourse("Flutter");
        student.addCourse("Python");

        student.displayCourses();

        student.removeCourse("C++");
        student.removeCourse("Flutter");

        student.displayCourses();
    }
}
