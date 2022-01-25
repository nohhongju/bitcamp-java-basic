package com.example.demo.calc;

import java.util.Scanner;
/**
 * packageName        : com.example.demo.calc
 * fileName           : CalcDemo.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class CalcDemo {
    public static void main(String[] args) {
        CalcApp calcApp = new CalcApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(CalcApp.CALC_APP);
        System.out.println("첫번째 숫자 : ");
        int num1 = scanner.nextInt();
        System.out.println("연사기호 : ");
        String opcode = scanner.next();
        System.out.println("두번째 숫자 : ");
        int num2 = scanner.nextInt();
        String res = calcApp.calc(num1, opcode, num2);
        System.out.println("연산결과 : "+ res);
    }
}