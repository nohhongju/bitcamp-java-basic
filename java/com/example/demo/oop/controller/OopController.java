package com.example.demo.oop.controller;

import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.controller
 * fileName           : PhoneController
 * author             : nohhongju
 * date               : 2022-02-08
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08    nohhongju    최초 생성
 */
public class OopController {
    public void execute(Scanner scanner) {

        PhoneService service = new PhoneServiceImpl();
        String s = "";
        while (true){
            System.out.println("메뉴 선택");
            System.out.println("0.Exit 1.집전화 2.휴대폰 3.아이폰 4.갤럭시노트");
            switch (scanner.next()){
                case "0":
                    s = "Exit";return;
                case "1":
                    s = "집전화";
                    service.usePhone(scanner);break;
                case "2":
                    s = "휴대폰";
                    service.useCelPhone(scanner);break;
                case "3":
                    s = "아이폰";
                    service.useIPhone(scanner);break;
                case "4":
                    s = "갤럭시노트";
                    service.useGalPhone(scanner);break;
                default:
                    s = "WRONG";break;
            }
            System.out.println(s);
        }


    }

}
