package com.example.demo.auth.domain;
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
public class UserDTO {
    public static String LOGIN_APP = "로그인앱";

    private final static UserDTO userDTO = new UserDTO();
    private UserDTO(){}
    public static UserDTO getInstance(){return userDTO;}

    private String id;
    private String pw;
    private String name;


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

        /*
        if(pw.equals(PASSWORD)){
            res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw);
        }else {
            res = String.format("%s 의 ID는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", this.id, this.pw);
        }*/


        /*
        res = (pw.equals(PASSWORD)) ? String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ", this.name, this.pw)
                        : String.format(" %s 의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ", this.id, this.pw);

        return res;*/

}