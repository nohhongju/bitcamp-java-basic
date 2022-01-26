package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.grade
 * fileName           : GradeDemo
 * author             : nohhongju
 * date               : 2022-01-26
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26    nohhongju    최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();
        System.out.println(GradeApp.GRADE_TITLE);
        System.out.println("name");
        String name = scanner.next();
        System.out.println("kor");
        int kor = scanner.nextInt();
        System.out.println("eng");
        int eng = scanner.nextInt();
        System.out.println("math");
        int math = scanner.nextInt();

        String grade = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(grade);
    }
}
