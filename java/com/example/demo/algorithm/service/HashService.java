package com.example.demo.algorithm.service;

import java.util.Scanner;

/**
 * packageName        : com.example.demo.algorithm.service
 * fileName           : HashService
 * author             : nohhongju
 * date               : 2022-02-08
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08    nohhongju    최초 생성
 */
public interface HashService {
    String failedPlayer(String[] participant, String[] completion);
    boolean phoneBook(String[] phone_book);
    int spy(String[][] clothes);
    int[] bestAlbum(String[] genres, int[] plays);

}
