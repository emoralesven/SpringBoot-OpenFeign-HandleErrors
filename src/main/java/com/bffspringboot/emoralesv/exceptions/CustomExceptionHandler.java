package com.bffspringboot.emoralesv.exceptions;

import com.bffspringboot.emoralesv.dtos.ExceptionMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<ExceptionMessage> handleProductServiceNotAvailableException(ResourceNotFoundException exception) {
        return new ResponseEntity<>(exception.getExceptionMessage(),HttpStatus.resolve(exception.getExceptionMessage().getStatus()));
    }


}