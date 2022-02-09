package com.example.demo.oop.controller;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;
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

        String s = "";
        while (true){
            System.out.println("[서브메뉴]0.Exit\n"+ "1.은닉화(Encapsulation)\n"+
                    "2.상속(Inheritance)\n"+ "3. 추상화(Abstraction)\n"+ "4. 다형성 Polymorphism");
            switch (scanner.next()){
                case "0":
                    s = "Exit";return;
                case "1":
                    s = "POJO가 은닉화다.";
                    break;
                case "2":
                    s = "extends는 상속이다.";
                    Phone phone = new Phone("금성전화기","금성전화");
                    CelPhone celPhone = new CelPhone("무선핸드폰","싸이온","이동중에");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("[소메뉴]0.exit 1.집전화 2.휴대전화 3.아이폰 4.갤럭시폰");
                    switch (scanner.next()){
                        case "0":
                            s = "exit";return;
                        case "1":
                            s = "###집전화###";
                            phone.setCall("여보세요.***입니다.");
                            phoneService.usePhone(phone);
                            break;
                        case "2":
                            s ="###휴대전화###";
                            celPhone.setCall("여보세요.");
                            phoneService.useCelPhone(celPhone);
                            break;
                        case "3":
                            s = "###아이폰###";
                            iPhone.setSearch("뉴스");
                            phoneService.useIPhone(iPhone);
                            break;
                        case "4":
                            s = "###갤럭시폰###";
                            galPhone.setPay("삼성페이");
                            phoneService.useGalPhone(galPhone);
                            break;
                        default:
                            s = "wrong";break;
                    }
                    break;
                case "3":
                    s = "추상화";
                    break;
                case "4":
                    s = "다형성";
                    break;
                default:
                    s = "WRONG";break;
            }
            System.out.println(s);
        }


    }

}
