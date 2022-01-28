package com.example.demo.service;

import com.example.demo.domain.GoolgeDTO;

/**
 * packageName        : com.example.demo.calc.google
 * fileName           : GoogleDemo.java
 * author             : nohhongju
 * date               : 2022-01-25
 * desc               : 구글앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25    nohhongju    최초 생성
 */
public class GoogleService {
    public String getGoolge(GoolgeDTO goolge) {

        return String.format("%s의 검색결과입니다", goolge.getSearch());

    }
}
