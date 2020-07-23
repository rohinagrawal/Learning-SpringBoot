package dev.rohin.practice.dto;

import org.springframework.http.HttpStatus;

public class ResponseDto<T> {

    private T data;

    private HttpStatus httpStatus;

    public ResponseDto(T data, HttpStatus httpStatus) {
        this.data = data;
        this.httpStatus = httpStatus;
    }
}
