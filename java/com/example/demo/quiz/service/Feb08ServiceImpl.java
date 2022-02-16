package com.example.demo.quiz.service;

import java.util.Scanner;
import java.util.Random;
/**
 * packageName        : com.example.demo.quiz.service
 * fileName           : Feb08ServiceImpl
 * author             : nohhongju
 * date               : 2022-02-08
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08    nohhongju    최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
        int[] lotto = new int[6]; //로또 번호 받을 배열
        for (int i = 0; i <lotto.length; i++){ //로또 번호 입력 반복문
            lotto [i] = (int) (Math.random()*45)+1; //임의의 값을 반환
            for (int j=0; j < i; j++){
                if(lotto[i]==lotto[j]){ //같은 숫자일 경우
                    i--; //중복없이
                }
            }
            System.out.println("로또 랜덤 숫자 : "+lotto[i]);
        }
    }

    @Override
    public void baseball(Scanner scanner) {//양정오
        int com[] = new int[3]; // 컴퓨터 숫자
        int user[] = new int[3]; // 사용자 숫자
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0; // 게임 횟수
        // 랜덤 숫자 생성
        while (com[0] == 0) {
            com[0] = r.nextInt(10);
        }
        while (com[0] == com[1] || com[1] == 0) {
            com[1] = r.nextInt(10);
        }
        while (com[1] == com[2] || com[2] == 0) {
            com[2] = r.nextInt(10);
        }

        while (true) {
            int strike = 0;
            int ball = 0;
            for (int i = 0; i < user.length; i++) {
                System.out.print((i + 1) + "번째 수: ");
                user[i] = sc.nextInt();
                if (user[i] > 9 || user[i] <= 0) {
                    System.out.println("숫자 범위는 1~9 입니다.");
                }
            }
            for (int i = 0; i < com.length; i++) {
                for (int j = 0; j < user.length; j++) {
                    if (com[i] == user[j] && i == j) { // 숫자와 위치가 일치
                        strike++;
                    } else if (com[i] == user[j] && i != j) { // 위치는 다르나 숫자는 일치
                        ball++;
                    }
                }
            }
            System.out.println(strike + " 스트라이크 " + ball + " 볼 ");
            count++;
            if (strike == 3) {
                System.out.println("게임 끝\n" + count + "번째 시도 성공");
                break;
            }
        }
    }
    /** author        :   JeongmyeongHong
     *  desc          :   예약하는 사람의 정보를 받고 인원수만큼의 좌석을 예약하고 예약번호를 부여한다.
     *                    부여받은 예약번호를 통해 예약된 정보를 확인 할 수 있다.
     * */
    @Override
    public void booking(Scanner scanner) {//홍정명
        String[] name = new String[5];
        String[] phoneNum = new String[5];
        int[] howMany = new int[5];
        int[] seat = new int[100];
        for (int i = 0; i < name.length; i++) {
            name[i] = "";
            phoneNum[i] = "";
        }
        while (true) {
            System.out.println("0.시스템 종료 1.예약하기 2.예약확인");
            switch (scanner.next()) {
                case "0":
                    System.out.println("시스템을 종료합니다.");
                    return;
                case "1":
                    System.out.println("예약하기\n" +
                            "이름, 전화번호, 인원수를 입력해주세요.");
                    for (int i = 0; i < name.length; i++) {
                        if (name[i].equals("")) {
                            name[i] = scanner.next();
                            phoneNum[i] = scanner.next();
                            howMany[i] = scanner.nextInt();
                            for (int j = 0; j < howMany[i]; j++) { //인원수 만큼의 좌석 예약
                                System.out.println(j + 1 + "번 좌석의 번호를 입력해주세요.(1~100)");
                                int seatNum = scanner.nextInt() - 1;
                                if (seat[seatNum] == 0) { //현재 비어있는(값이 0) 좌석 이라면 예약
                                    seat[seatNum] = i + 1;
                                } else {
                                    System.out.println("이미 선택된 좌석입니다.");
                                    j--;
                                }
                            }
                            System.out.println("당신의 예약 번호는 " + (i + 1) + "번 입니다.");
                            break;
                        } else if (i == name.length - 1) {
                            System.out.println("빈 자리가 없습니다.");
                        }
                    }

                    break;
                case "2":
                    System.out.println("예약확인\n" +
                            "부여된 예약번호를 입력해주세요");
                    String res = "";
                    int inputNum = scanner.nextInt() - 1;
                    for (int i = 0; i < seat.length; i++) {
                        if (seat[i] == (inputNum + 1)) {
                            res += String.format(" %d", i + 1);
                        }
                    }
                    System.out.printf("예약된 이름 : %s\n" +
                                    "예약된 번호 : %s\n" +
                                    "예약된 인원 : %d\n" +
                                    "예약된 좌석 : %s 입니다.%n\n",
                            name[inputNum], phoneNum[inputNum], howMany[inputNum], res);
                    break;
                default:
                    System.out.println("잘못된 번호입니다. 다시 눌러주세요.");
            }
        }
    }

    @Override
    public void bank(Scanner scanner) {//전종현
        int money = 0;
        while (true) {
            System.out.println("0.Exit | 1. 입금 2. 출금 3. 잔고");
            switch (scanner.next()) {
                case "0":
                    System.out.println("Exit");
                    return;
                case "1":
                    System.out.println("1.입금");
                    money += scanner.nextInt();
                    break;
                case "2":
                    System.out.println("2.출금");
                    money -= scanner.nextInt();
                    break;
                case "3":
                    System.out.println("3.잔고");
                    System.out.println("잔고는 : " + money);
                    break;
                default:
                    System.out.println("잘못된 숫자");
                    break;
            }
        }
    }

    @Override
    public void gugudan(Scanner scanner) {//정경준
        System.out.println("5. 구구단" + "\n" + "   --몇 단을 출력할까요--    ");
        String result;
        int i = scanner.nextInt();
        System.out.println("    ---    " + i + "단    ---    ");
        for (int j = 1; j < 10; j++) {
            result = String.format("%d x %d = %d", i, j, (i * j));
            System.out.print(result + "\t");
        }
    }
}
