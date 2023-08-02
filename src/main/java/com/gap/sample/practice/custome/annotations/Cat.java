package com.gap.sample.practice.custome.annotations;

@CustomAnnotation
public class Cat {

    @CustomAnnotationOnField
    public String catName;


    public Cat(String catName){
this.catName=catName;
    }


    @CustomerAnnotationOnMethod(times = 10)
    public void meow(){
        System.out.println("Meow");
    }

    @CustomerAnnotationOnMethod
    public void bark(){
        System.out.println("Bark");
    }

}
