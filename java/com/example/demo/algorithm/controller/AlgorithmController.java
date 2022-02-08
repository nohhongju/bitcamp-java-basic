package com.example.demo.algorithm.controller;

import com.example.demo.algorithm.service.HeapService;
import com.example.demo.algorithm.service.HeapServiceImpl;
import com.example.demo.algorithm.service.SortService;
import com.example.demo.algorithm.service.SortServiceImpl;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.algorithm.controller
 * fileName           : AlgorithmController
 * author             : nohhongju
 * date               : 2022-02-08
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08    nohhongju    최초 생성
 */
public class AlgorithmController {
    public void execute(Scanner scanner){
        SortService sortService = new SortServiceImpl();
        HeapService heapService = new HeapServiceImpl();
        while (true){
            System.out.println("[담당]\n 0.종료 1.홍정명 2.노홍주 3.전종현 4.정경준 5.양정오");
            switch (scanner.next()){
                case "0":
                    System.out.println("EXIT");return;
                case "1":
                    System.out.println("0.Exit 1. 2. 3. 4.");
                    break;
                case "2":
                    System.out.println("0.Exit 1.sort 2.heap");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":

                        case "2":

                    }break;

            }
        }
    }
}
