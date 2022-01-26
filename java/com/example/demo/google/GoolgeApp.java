package com.example.demo.google;

/**
 * packageName        : com.example.demo.calc.google
 * fileName           : GoolgeApp.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               :
 * variable           :
 * [클래스 변수] GOOGLE_APP
 * [인스턴스 변수] search
 * [파라미터] search
 * [로컬변수] "%s 검색결과입니다."
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class GoolgeApp {
    static String GOOGLE_APP = "google";
    private String search;

    public String google(String search){
        this.search = search;
        String res = "%s 검색결과입니다.";
        return String.format(res, this.search);



    }
}
