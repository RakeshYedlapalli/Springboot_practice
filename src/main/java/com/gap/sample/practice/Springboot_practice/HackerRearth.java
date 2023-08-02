package com.gap.sample.practice.Springboot_practice;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HackerRearth {

    public static void main(String[] args) {


        Optional<String> s = Optional.of("sdfs");
        /*CompletableFuture<String> future1 =
                CompletableFuture.supplyAsync(()-> "Hi")
                        .thenCompose(s-> CompletableFuture.supplyAsync(()->s+" Alisa"));



        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()-> "Apple")
                .thenCombine (CompletableFuture.supplyAsync(()-> "Banana"),(s1,s2) -> s1+ " ");


        *//*CompletableFuture future3 = CompletableFuture.supplyAsync(()-> "Result")
                .thenCompose (CompletableFuture.supplyAsync(()-> "From Thrid"),(s1,s2)
                        -> System.out.println(s1+s2));*//*


        try{
            System.out.println(future1.get());
            System.out.println(future2.get());
            //future3.get();
        }  catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }*/


    }


    static int count_buildings(int N , int[] A , int [] k){



        int reult = 0;

        for(int i=0;i<A.length;i++){

            int count = 0;
            boolean flag = false;
                    for(int j=0;j<i;j++){
                        if(A[j]<A[i]){
                            count ++;
                        }
                        else{
                            flag = true;
                        }
                    }
                    if(count<k[i] && flag == false){
                        reult = reult + 1;
                    }
        }
        System.out.println(reult);
        return reult;
    }
}
