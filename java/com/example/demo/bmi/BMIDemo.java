package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.bmi
 * fileName           : BMIDemo
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : BMI앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class BMIDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMIApp bmiApp = new BMIApp();
        System.out.println(bmiApp.BMI_APP);
        System.out.println("name");
        String name = scanner.next();
        System.out.println("height");
        String height = scanner.next();
        System.out.println("weight");
        String weight = scanner.next();
        String res = bmiApp.bmi(name, height, weight);
        System.out.println(res);

    }
}
