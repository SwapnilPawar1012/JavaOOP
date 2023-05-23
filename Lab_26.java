// 24. Create a class Student with attributes roll no, name, age and course. Initialize values through the parameterized constructor. If the age of the student is not between 15 and 21 then generate the user-defined exception "AgeNotWithinRangeException". If a name contains numbers or special symbols raise the exception "NameNotValidException". Define the two exception classes.

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String massage) {
        super(massage);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String massage) {
        super(massage);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name should contains only alphabets and spaces.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;

        System.out.println("Student created successfully!");
    }
}

public class Lab_26 {
    public static void main(String[] arg) {
        try {
            Student student = new Student(1, "Swapnil", 19, "CSE");
            Student student1 = new Student(2, "Swapnil", 20, "IT");

            System.out.println(student);
            System.out.println(student1);
        } catch (Exception e) {
            System.out.println("Exception cought: " + e.getMessage());
        }
    }
}
