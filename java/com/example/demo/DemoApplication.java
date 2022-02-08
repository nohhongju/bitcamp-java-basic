package com.example.demo;

import com.example.demo.oop.controller.OopController;
import com.example.demo.quiz.controller.QuizController;
import com.example.demo.auth.controller.AuthController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		OopController phoneController = new OopController();
		QuizController quizController = new QuizController();
		AuthController memberController = new AuthController();

		String s = "";
		while (true){
			System.out.println("메뉴선택");
			System.out.println("0.Exit 1.Auth 2.OOP 3.Quiz 4.Algorithm");
			switch (scanner.next()){
				case "0":
					s = "Exit";return;
				case "1":
					s = "Auth";
					memberController.execute(scanner);
					break;
				case "2":
					s = "OOP";
					phoneController.execute(scanner);
					break;
				case "3":
					s = "Quiz";
					quizController.execute(scanner);
					break;
				case "4":
					s = "Algorithm";
					break;
				default:
					s = "Wrong";break;
			}
			System.out.println(s);
		}
	}


}
