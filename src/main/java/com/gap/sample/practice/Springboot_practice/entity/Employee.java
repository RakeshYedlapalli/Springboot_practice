package com.gap.sample.practice.Springboot_practice.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gap.sample.practice.Springboot_practice.validation.TypeChecking;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@ToString
@Getter
@Setter
@Document(collection = "employee")
//@Pattern(regexp = ".*\\d.*", message = "must contain at least one numeric character")
public class Employee {

//    @NotBlank(message = "User naem shoudlt be invalid")
    private  String firstName;
//    @NotBlank(message = "Last should have atleast one character")
    private  String lastName;
    @Id
    private  String empId;

//    @JsonIgnore
    //@Transient
    private  Boolean isMarried;

//    @Max(value = 10,message = "Mobile number max can have 10 numbers")
//    @Min(value = 9, message = "Mobile number have have min 9 digits")

    //@ValidateEmployeeType2
    private int mobileNumber;
//    @Transient
    private int age;


    @TypeChecking
    private String employeeType;


    public  Employee () {

        this.lastName = "rakesh";
    }



    public static void main(String[] args) {


        Employee employee = new Employee();

        System.out.println(isEven(70) ==1 ? "Odd":"even");


    }

    public static int isEven(int n){

        return ((n & 1));
    }

    //binary search , what is prerequi

}
