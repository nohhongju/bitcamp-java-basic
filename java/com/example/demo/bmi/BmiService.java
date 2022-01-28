package com.example.demo.bmi;

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
public class BmiService {
    public String getBmi(BmiDTO bmi) {

        return String.format("%s의 수치는 정상입니다", bmi.getName());
    }

}
