package com.example.demo.auth.domain;

/**
 * packageName        : com.example.demo.domain
 * fileName           : GoogleDTO
 * author             : nohhongju
 * date               : 2022-02-07
 * desc               :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07    nohhongju    최초 생성
 */
public class GoogleDTO {
    public static String GOOGLE = "Google";
    private String search;

    public String getSearch(){
        return search;
    }
    public void setSearch(String search){
        this.search = search;
    }
}
