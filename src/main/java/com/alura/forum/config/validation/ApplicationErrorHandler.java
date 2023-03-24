package com.alura.forum.config.validation;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.alura.forum.controller.validation.FormError;

@RestControllerAdvice
public class ApplicationErrorHandler {

	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<FormError> handlerValidation(MethodArgumentNotValidException exception) {
		
		
		
	}
	
}
