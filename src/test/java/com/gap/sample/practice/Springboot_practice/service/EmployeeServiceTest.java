package com.gap.sample.practice.Springboot_practice.service;

import com.gap.sample.practice.Springboot_practice.repositories.EmployeeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;


class EmployeeServiceTest {


    @InjectMocks
    public EmployeeService employeeService;

    @Mock
    public EmployeeRepository employeeRepository;


    @BeforeEach
    void setUp() {
      //  MockitoAnnotations.initMocks(this);
        //MockitoAnnotations.openMocks(this);


    }

    @Test
    public void set(){

        System.out.println();

    }
}