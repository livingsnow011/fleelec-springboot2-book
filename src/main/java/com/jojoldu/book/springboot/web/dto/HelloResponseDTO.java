package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //final 클래스만매개변수로 받는 생성자
//NoArgsConstructor - RequiredArgsConstructor - AllArgsConstructor
public class HelloResponseDTO {

    private final String name;
    private final int amount;

}
