package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.service.*;
import com.example.demo.domain.GoogleDTO;

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
public class StudentController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        StudentService service = new StudentServiceImpl();


        while (true) {
            System.out.println("메뉴 선택");
            System.out.println("0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN");
            String select = scanner.next();
            String res = "";

            switch (select) {
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    System.out.println(BmiDTO.BMI_APP+"\n 이름, 키, 몸무게 입력");
                    bmi.setName(scanner.next());
                    bmi.setTall(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    res = service.getBmi(bmi);
                    break;
                case "2":
                    System.out.println(CalcDTO.CALC_APP+"\n숫자1, 연사자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.getCalc(calc);
                    break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE +"\n검색어 입력");
                    google.setSearch(scanner.next());
                    res = service.getGoogle(google);
                    ;break;
                case "4":
                    System.out.println(GradeDTO.GRADE_TITLE+"\n이름, 국어, 영어, 수학 입력");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = service.getGrade(grade);
                    ;break;
                case "5":
                    System.out.println(LoginDTO.LOGIN_APP+"\nID, PW, Name 입력");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = service.getLogin(login);
                    ;break;
                default: res = "WRONG";break;
            }
            System.out.println(res);
        }
    }

}
