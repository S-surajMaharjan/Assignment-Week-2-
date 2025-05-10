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
        Student s1 = new Student("John", 85);
        Student s2 = new Student("Sara", 72);
        Student s3 = new Student("Mike", 45);
        s1.calculateGrade(); s2.calculateGrade(); s3.calculateGrade();
    }
}
