package com.example.demo.naver;

/**
 * packageName        : com.example.demo.naver
 * fileName           : NaverApp
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               :
 * [클래스 변수] NAVER_APP
 * [인스턴스 변수] id pw
 * [파라미터] id pw
 * [로컬 변수] "아이디 %s 로그인 성공"
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class NaverApp {
    static String NAVER_APP = "Naver";
    private String id;
    private String pw;

    public String naver(String id,String pw){
        this.id = id;
        this.pw = pw;
        String res = "아이디 %s 로그인 성공";
        return String.format(res, this.id);


    }
}
