package com.gap.sample.practice.Springboot_practice.advice.exception;

import com.gap.sample.practice.Springboot_practice.exception.NoEmployeesFoundInDatabase;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException methodArgumentNotValidException) {

        Map<String, String> errorMap = new HashMap<>();
        methodArgumentNotValidException.getFieldErrors().forEach(error -> errorMap.put(error.getField(), error.getDefaultMessage()));
        return errorMap;
    }

    @ExceptionHandler(NoEmployeesFoundInDatabase.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> globalException(NoEmployeesFoundInDatabase methodArgumentNotValidException) {

        Map<String, String> errorMap = new HashMap<>();
        //  methodArgumentNotValidException.getFieldErrors().forEach(error-> errorMap.put(error.getField(),error.getDefaultMessage()));
        errorMap.put("Exception", methodArgumentNotValidException.getMessage());
        return errorMap;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(11);
        list.add(51);
        list.add(61);
        list.add(110);

        list.stream().map(i -> Integer.toString(i)).filter(i -> i.startsWith("1")).forEach(System.out::println);


    }



    @Around("@annotation(com.gap.sample.practice.Springboot_practice.advice.LogRequestMethod)")
    public Object generateRequestMappingLog(final ProceedingJoinPoint joinPoint) throws Throwable {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        RequestMapping requestMappingAnnotation = signature.getMethod().getAnnotation(RequestMapping.class);
       // LogRequestMethod logRequestAnnotation = signature.getMethod().getAnnotation(LogRequestMethod.class);

        @SuppressWarnings("squid:S1312")
        final Logger logger = LoggerFactory.getLogger(signature.getDeclaringType());
//        Map<String, Object> jsonArguments =
//                buildJsonArguments(joinPoint, signature, logRequestAnnotation, requestMappingAnnotation);

        try {



        } catch(Exception e) {


            throw e;
        }
        return null;
    }



}
