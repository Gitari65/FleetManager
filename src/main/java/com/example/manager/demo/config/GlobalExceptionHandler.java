package com.example.manager.demo.config;

import org.apache.el.parser.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.thymeleaf.exceptions.TemplateProcessingException;

@ControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public  String handleException(Exception e, Model model){
    model.addAttribute("error",e.getMessage());
    return  "error";
}

    @ExceptionHandler(ParseException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleParseException(ParseException ex, Model model) {
        model.addAttribute("error", "Error in parsing expression: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(TemplateProcessingException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleTemplateProcessingException(TemplateProcessingException tex,Model model){
    model.addAttribute("error",tex.getMessage());
    return  "error";
    }

    @ExceptionHandler(HttpMessageConversionException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleHttpMessageConversionException(HttpMessageConversionException ex, Model model) {
        model.addAttribute("error", "Error converting message: " + ex.getMessage());
        return "error";
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public String handleNotFoundError(Model model){
    String errorMessage="Ooops! Something went wrong";
    model.addAttribute("error",errorMessage);
    return "error";
    }




}
