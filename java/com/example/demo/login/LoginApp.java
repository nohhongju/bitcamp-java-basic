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
 * 2022-01-26    nohhongju    if 절과 switch, 삼항연산자 사용
 */
public class LoginApp {
    public static String LOGIN_APP = "로그인앱";
    String id;
    String pw;
    String name;
    static String PASSWORD = "abc";

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        String res = "";

        /*
        if(pw.equals(PASSWORD)){
            res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw);
        }else {
            res = String.format("%s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", this.id, this.pw);
        }*/

        /*
        switch (pw){
            case "abc": res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw); break;
            default: res = String.format("%s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", this.id, this.pw); break;
        }*/
        res = (pw.equals(PASSWORD)) ? String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw)
                : String.format("%s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", this.id, this.pw);
        return res;


    }




}
