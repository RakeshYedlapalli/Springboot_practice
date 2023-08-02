package com.gap.sample.practice.Springboot_practice.rest.bean;


import core.java.exception.CheckedExceptionEx;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.concurrent.FutureTask;

@Entity(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    LinkedList list = new LinkedList();


    public static void main(String[] args) {


        String ss = "rakesh";
        finalyWithReturn("Helo");


    }

    public static String finalyWithReturn(String s) {


       // FutureTask
        try{
            String ss  = "";
            s.length();
//            throw new ChckedException("");

            try{

            }catch (Exception e) {

            }
        } catch (ChckedException e) {

        } finally {
            System.out.println("finally called");
        }
        return s;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal price;


    public static void checkedException() throws ChckedException {

        throw new ChckedException("Exception occuured");
    }

    // Constructors, getters, and setters
}
