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
    public String  execute(String name, String height, String weight) {
        BMIApp bmiApp = new BMIApp();
        return bmiApp.getBmi(name, height, weight);

    }
}
