package com.lld.lowleveldesign.advice;

import com.lld.lowleveldesign.exception.AppException;
import com.lld.lowleveldesign.pojo.communicators.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nevinsunny
 * date 24/03/24
 * time 3:42 pm
 */

@Slf4j
@ControllerAdvice
@RestController
@Order(0)
public class AppControllerAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(AppException.class)
    public BaseResponse lotteryTicketException(AppException exception) {
        log.error("AppException thrown", exception);
        return BaseResponse.builder()
                .code(HttpStatus.BAD_REQUEST)
                .message(exception.getMessage())
                .build();
    }
}
