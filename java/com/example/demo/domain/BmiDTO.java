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
    private String height;
    private String weight;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getHeight(){
        return height;
    }
    public void setHeight(String height){
        this.height = height;
    }
    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }


}




