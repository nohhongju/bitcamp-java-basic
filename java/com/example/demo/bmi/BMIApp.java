package com.example.demo.bmi;

/**
 * packageName        : com.example.demo.bmi
 * fileName           : BMIApp
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               :
 * [클래스 변수] BMI_APP
 * [인스턴스 변수] name height weight
 * [파라미터] name height weight
 * [로컬 변수] res
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class BMIApp {
    public static String BMI_APP = "bmi";
    private String name;
    private String height;
    private String weight;

    public String bmi(String name, String height, String weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
        String res = String.format("");
        return res;
    }

}
