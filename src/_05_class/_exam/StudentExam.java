package _05_class._exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam {
    public static void main(String[] args) {
        Student s1 = new Student("김새싹", 20231001, 1);
        Student s2 = new Student("박지은", 20231002, 2);
        Student s3 = new Student("김새싹", 20231003, 3);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        System.out.println("총 학생 수는 "+Student.totalStudents+"명 입니다.");
    }
}
