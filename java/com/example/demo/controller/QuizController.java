package com.example.demo.controller;

import com.example.demo.service.QuizService;
import com.example.demo.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.controller
 * fileName           : TempController
 * author             : nohhongju
 * date               : 2022-02-03
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03    nohhongju    최초 생성
 */
public class QuizController {
    public static void main(String[] args) {
        String[] arr = {"홍정명",   "노홍주", "양정오", "전종현", "정경준",
                "깊이우선탐색", "정렬", "이분탐색", "해시", "완전탐색",
                "너비우선탐색", "힙",   "그래프", "탐욕법", "동적계획법",
                "스택",
                "큐"};
        Scanner scanner = new Scanner(System.in);
        QuizService service =new QuizServiceImpl();
        while (true){
            System.out.println("메뉴선택");
            System.out.println("0.Exit 1.Q1 2.Q2 3.Q3 4.Q4");
            switch (scanner.next()){
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    service.quiz1(arr);break;
                case "2":
                    service.quiz2(arr);break;
                case "3":
                    service.quiz3(arr);break;
                case "4":
                    service.quiz4(arr);break;
            }
        }
    }

}
