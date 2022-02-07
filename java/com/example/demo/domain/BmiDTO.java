package com.example.demo.domain;

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
public class BmiDTO {
    public static String BMI_APP = "bmi";
    private String name;
    private double tall;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}




