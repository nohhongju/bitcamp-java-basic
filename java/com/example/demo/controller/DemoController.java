package com.example.demo.controller;

import com.example.demo.domain.BmiDTO;
import com.example.demo.service.BmiService;
import com.example.demo.domain.CalcDTO;
import com.example.demo.service.CalcService;
import com.example.demo.service.GoogleService;
import com.example.demo.domain.GoolgeDTO;
import com.example.demo.domain.GradeDTO;
import com.example.demo.service.GradeService;
import com.example.demo.domain.LoginDTO;
import com.example.demo.service.LoginService;

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
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoolgeDTO google = new GoolgeDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();

        BmiService bmiService = new BmiService();
        CalcService calcService = new CalcService();
        GoogleService googleService = new GoogleService();
        GradeService gradeService = new GradeService();
        LoginService loginService = new LoginService();

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
                    bmi.setHeight(scanner.next());
                    bmi.setWeight(scanner.next());
                    res = bmiService.getBmi(bmi);
                    break;
                case "2":
                    System.out.println(CalcDTO.CALC_APP+"\n숫자1, 연사자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.getCalc(calc);
                    break;
                case "3":
                    System.out.println(GoolgeDTO.GOOLGE_APP +"\n검색어 입력");
                    google.setSearch(scanner.next());
                    res = googleService.getGoolge(google);
                    ;break;
                case "4":
                    System.out.println(GradeDTO.GRADE_TITLE+"\n이름, 국어, 영어, 수학 입력");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = gradeService.getGrade(grade);
                    ;break;
                case "5":
                    System.out.println(LoginDTO.LOGIN_APP+"\nID, PW, Name 입력");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = loginService.getLogin(login);
                    ;break;
                default: res = "WRONG";break;
            }
            System.out.println(res);
        }
    }

}
