package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.service
 * fileName           : Feb07ServiceImpl
 * author             : nohhongju
 * date               : 2022-02-07
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07    nohhongju    최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {

    @Override
    public void dice(Scanner scanner) {
    }

    @Override
    public void rps(Scanner scanner) {
        int user = 0;
        int com = (int)(Math.random()*3);
        System.out.println("가위바위보 게임");
        System.out.println("0.가위 1.바위 2.보 선택");
        user = scanner.nextInt();
        String[] str ={"가위","바위","보"};
        System.out.println("컴퓨터 : "+str[com]+", 사용자 : "+str[user]);
        switch (com-user){
            case 1:
                case -2:
                System.out.println("컴퓨터 승");break;
            case 2:
                case -1:
                System.out.println("사용자 승");break;
            default:
                System.out.println("비겼습니다.");break;
        }

    }

    @Override
    public void getPrime(Scanner scanner) {

    }

    @Override
    public void leapYear(Scanner scanner) {

    }

    @Override
    public void numberGolf(Scanner scanner) {

    }
}
