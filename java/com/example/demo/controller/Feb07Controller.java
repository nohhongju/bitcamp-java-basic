package com.example.demo.controller;

import com.example.demo.service.Feb07ServiceImpl;
import com.example.demo.service.FebService;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.controller
 * fileName           : Feb07Controller
 * author             : nohhongju
 * date               : 2022-02-07
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07    nohhongju    최초 생성
 */
public class Feb07Controller {
    /**
     * 1. 주사위  dice
     * 2. 가위바위보  rps
     * 3. 입력받은 두 수 사이의 있는 소수 구하기  getPrime
     * 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기  leapYear
     * 5. 임의로 입력받은 숫자 맞추기  numberGolf
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FebService service = new Feb07ServiceImpl();
        while (true){
            System.out.println("메뉴선택");
            System.out.println("0.Exit 1.dice 2.rps 3.getPrime 4.leapYear 5.numberGolf");
            switch (scanner.next()){
                case "0":
                    System.out.println("Exit");return;
                case "1":
                    service.dice(scanner);break;
                case "2":
                    service.rps(scanner);break;
                case "3":
                    service.getPrime(scanner);break;
                case "4":
                    service.leapYear(scanner);break;
                case "5":
                    service.numberGolf(scanner);break;

            }
        }
    }

}
