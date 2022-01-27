package com.example.demo.controller;

import com.example.demo.bmi.BMIApp;
import com.example.demo.bmi.BMIDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.google.GoogleDemo;
import com.example.demo.google.GoolgeApp;
import com.example.demo.grade.GradeApp;
import com.example.demo.grade.GradeDemo;
import com.example.demo.login.LoginApp;
import com.example.demo.login.LoginDemo;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.controller
 * fileName           : DemoController
 * author             : nohhongju
 * date               : 2022-01-27
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27    nohhongju    최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMIDemo bmiDemo = new BMIDemo();
        CalcDemo calcDemo = new CalcDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeDemo gradeDemo = new GradeDemo();
        LoginDemo loginDemo = new LoginDemo();

        while (true) {
            System.out.println("메뉴 선택");
            System.out.println("0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN");
            String select = scanner.next();
            String res = "";

            switch (select) {
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    System.out.println(BMIApp.BMI_APP+"\n 이름, 키, 몸무게 입력");
                    res = bmiDemo.execute(scanner.next(), scanner.next(), scanner.next());
                    ;break;
                case "2":
                    System.out.println(CalcApp.CALC_APP+"\n숫자1, 연사자, 숫자2 입력");
                    res = calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                break;
                case "3":
                    System.out.println(GoolgeApp.GOOGLE_APP +"\n검색어 입력");
                    res = googleDemo.execute(scanner.next());
                    ;break;
                case "4":
                    System.out.println(GradeApp.GRADE_TITLE+"\n이름, 국어, 영어, 수학 입력");
                    res = calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                    ;break;
                case "5":
                    System.out.println(LoginApp.LOGIN_APP+"\nID, PW, Name 입력");
                    res = loginDemo.execute(scanner.next(), scanner.next(), scanner.next());
                    ;break;
                default: res = "WRONG";break;
            }
            System.out.println(res);
        }
    }

}
