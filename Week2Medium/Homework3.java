class Student {
    String name;
    int marks;
    Student(String n, int m) {
        name = n; marks = m;
    }
    void calculateGrade() {
        char grade;
        if (marks >= 80) grade = 'A';
        else if (marks >= 60) grade = 'B';
        else if (marks >= 50) grade = 'C';
        else if (marks >= 40) grade = 'D';
        else grade = 'F';
        System.out.println(name + " Grade: " + grade);
    }
}

public class Homework3 {
    public static void main(String[] args) {
        Student s1 = new Student("Suraj", 100);
        Student s2 = new Student("Momzee", 75);
        Student s3 = new Student("Momzer", 15);
        s1.calculateGrade(); s2.calculateGrade(); s3.calculateGrade();
    }
}
