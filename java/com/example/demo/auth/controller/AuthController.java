package com.example.demo.auth.controller;

import com.example.demo.auth.domain.*;
import com.example.demo.auth.service.MemberServiceImpl;
import com.example.demo.auth.service.MemberService;

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
public class AuthController {
    public static void execute(Scanner scanner) {

        BmiDTO bmi = BmiDTO.getInstance();
        CalcDTO calc = CalcDTO.getInstance();
        GoogleDTO google = GoogleDTO.getInstance();
        GradeDTO grade = GradeDTO.getInstance();
        UserDTO login = UserDTO.getInstance();
        MemberService service = new MemberServiceImpl();


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
                    BmiDTO a = BmiDTO.getInstance();
                    a.setName(scanner.next());
                    a.setTall(scanner.nextDouble());
                    a.setWeight(scanner.nextDouble());
                    res = service.getBmi(a);
                    break;
                case "2":
                    System.out.println(CalcDTO.CALC_APP+"\n숫자1, 연사자, 숫자2 입력");
                    CalcDTO b = CalcDTO.getInstance();
                    b.setNum1(scanner.nextInt());
                    b.setOpcode(scanner.next());
                    b.setNum2(scanner.nextInt());
                    res = service.getCalc(b);
                    break;
                case "3":
                    System.out.println(GoogleDTO.GOOGLE +"\n검색어 입력");
                    GoogleDTO c = GoogleDTO.getInstance();
                    c.setSearch(scanner.next());
                    res = service.getGoogle(c);
                    ;break;
                case "4":
                    System.out.println(GradeDTO.GRADE_TITLE+"\n이름, 국어, 영어, 수학 입력");
                    GradeDTO d = GradeDTO.getInstance();
                    d.setName(scanner.next());
                    d.setKor(scanner.nextInt());
                    d.setEng(scanner.nextInt());
                    d.setMath(scanner.nextInt());
                    res = service.getGrade(d);
                    ;break;
                case "5":
                    System.out.println(UserDTO.LOGIN_APP+"\nID, PW, Name 입력");
                    UserDTO u = UserDTO.getInstance();
                    u.setId(scanner.next());
                    u.setPw(scanner.next());
                    u.setName(scanner.next());
                    res = service.getLogin(u);
                    ;break;
                default: res = "WRONG";break;
            }
            System.out.println(res);
        }
    }

}
