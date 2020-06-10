package com.learnspringboot.demowebapp.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ResponseDto<T> {
    private HttpStatus statusCode;
//    private String serverID = "123";
    private T data;


    public ResponseDto(HttpStatus statusCode, T data){
        this.statusCode = statusCode;
        this.data = data;
    }
}
