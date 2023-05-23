// 5. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for each of the two classes and print the percentage of marks for both students.

package OOPs;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;

    public A(double sub1, double sub2, double sub3) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
    }

    double getPercentage() {
        double percentage = subject1 + subject2 + subject3;
        return (percentage/3.0);
    }
}

class B extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public B(double sub1, double sub2, double sub3, double sub4) {
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
        this.subject4 = sub4;
    }

    double getPercentage() {
        double percentage = subject1 + subject2 + subject3 + subject4;
        return (percentage/4.0);
    }
}

public class Lab_8 {
    public static void main(String[] arg) {
        A subjectA = new A(80, 90, 70);
        B subjectB = new B(60, 78, 89.9, 75.9);

        System.out.println("Percentage of student A: " + subjectA.getPercentage());
        System.out.println("Percentage of student B: " + subjectB.getPercentage());
    }
}
