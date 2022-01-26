package com.example.demo.login;
/**
 * packageName        : com.example.demo.calc
 * fileName           : LoginApp.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 아이디, 비번, 이름을 받아서 로그인하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class LoginApp {
    static String LOGIN_APP = "로그인";
    String id;
    String pw;
    String name;
    static String PASSWORD = "abc";

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        String res = "";

        res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw);
        res = String.format("%s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", this.id, this.pw);
        return res;


    }




}
