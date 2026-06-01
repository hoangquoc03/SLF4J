package org.example.slf4j.Exception;


import lombok.extern.slf4j.Slf4j;
import org.example.slf4j.Model.Dto.ApiResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponseError> handleException(Exception e) {

        // Ghi full stack trace vào log
        log.error("Lỗi hệ thống xảy ra: ", e);

        ApiResponseError error = new ApiResponseError(
                500,
                "Đã xảy ra lỗi hệ thống"
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}