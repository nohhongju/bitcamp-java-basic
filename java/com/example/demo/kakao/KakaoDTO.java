package com.example.demo.kakao;
/**
 * packageName        : com.example.demo.calc
 * fileName           : KakaoApp.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 전화번호와 메시지를 받아서 전송하는 어플을 만드시오
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */

public class KakaoDTO {
    static String KAKAO_APP = "카카오";
    String telno;
    String message;

    public String kakao(String telno, String message){
        this.telno = telno;
        this.message = message;
        return String.format(" Telno : %s, Message : %s ", this.telno, this.message);
    }
}
