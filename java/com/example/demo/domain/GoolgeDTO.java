package com.example.demo.domain;

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
public class GoolgeDTO {
    public static String GOOLGE_APP = "google";
    private String search;

    public String getSearch(){
        return search;
    }
    public void setSearch(String search){
        this.search = search;
    }

}
