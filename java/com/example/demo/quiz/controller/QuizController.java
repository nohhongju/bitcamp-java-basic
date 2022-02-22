package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

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
    public void execute(Scanner scanner){
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        Feb10Service feb10Service = new Feb10ServiceImpl();
        while (true){
            System.out.println("\n[서브메뉴]\n 0) Exit 1) 2월6일 2) 2월7일 3) 2월8일 4) 2월10일");
            switch (scanner.next()){
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    String[] arr = {"홍정명",   "노홍주", "양정오", "전종현", "정경준",
                            "깊이우선탐색", "정렬", "이분탐색", "해시", "완전탐색",
                            "너비우선탐색", "힙",   "그래프", "탐욕법", "동적계획법",
                            "스택",
                            "큐"};
                        System.out.println("[소메뉴]\n 0.Exit 1.Q1 2.Q2 3.Q3 4.Q4");
                        switch (scanner.next()) {
                            case "0":
                                System.out.println("Exit");
                                return;
                            case "1":
                                feb06Service.quiz1(arr);
                                break;
                            case "2":
                                feb06Service.quiz2(arr);
                                break;
                            case "3":
                                feb06Service.quiz3(arr);
                                break;
                            case "4":
                                feb06Service.quiz4(arr);
                                break;
                        }
                        break;
                case "2":
                    System.out.println("[소메뉴]\n 0.Exit 1.dice 2.rps 3.getPrime 4.leapYear 5.numberGolf");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("dice");
                            feb07Service.dice(scanner);
                            break;
                        case "2":
                            System.out.println("rps");
                            feb07Service.rps(scanner);
                            break;
                        case "3":
                            System.out.println("getPrime");
                            feb07Service.getPrime(scanner);
                            break;
                        case "4":
                            System.out.println("leapYear");
                            feb07Service.leapYear(scanner);
                            break;
                        case "5":
                            System.out.println("numberGolf");
                            feb07Service.numberGolf(scanner);
                            break;
                    }break;
                case "3":
                    System.out.println("[소메뉴]\n 0.Exit 1.lotto 2.baseball 3.booking 4.bank 5.gugudan");
                    switch (scanner.next()) {
                        case "0":
                            System.out.println("Exit");
                            return;
                        case "1":
                            System.out.println("lotto");
                            feb08Service.lotto(scanner);
                            break;
                        case "2":
                            System.out.println("baseball");
                            feb08Service.baseball(scanner);
                            break;
                        case "3":
                            System.out.println("booking");
                            feb08Service.booking(scanner);
                            break;
                        case "4":
                            System.out.println("bank");
                            feb08Service.bank(scanner);
                            break;
                        case "5":
                            System.out.println("gugudan");
                            feb08Service.gugudan(scanner);
                            break;

                    }break;
                case "4":
                    System.out.println("[소메뉴]\n 0.exit 1.bubbleSort 2.insertionSort 3.selectionSort 4.quickSort 5.mergeSort 6.magicSquare 7.zigzag 8.rectangleStarPrint ");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("exit");
                            break;
                        case "1":
                            System.out.println("bubbleSort");
                            feb10Service.bubbleSort();
                            break;
                        case "2":
                            System.out.println("insertionSort");
                            feb10Service.insertionSort();
                            break;
                        case "3":
                            System.out.println("selectionSort");
                            feb10Service.selectionSort();
                            break;
                        case "4":
                            System.out.println("quickSort");
                            feb10Service.quickSort();
                            break;
                        case "5":
                            System.out.println("mergeSort");
                            feb10Service.mergeSort();
                            break;
                        case "6":
                            System.out.println("magicSquare");
                            //feb10Service.magicSquare();
                            break;
                        case "7":
                            System.out.println("zigzag");
                            feb10Service.zigzag();
                            break;
                        case "8":
                            System.out.println("rectangleStarPrint");
                            feb10Service.rectangleStarPrint();
                            break;
                    }break;
                default:
                    System.out.println("Wrong");break;
            }
        }
    }
}
