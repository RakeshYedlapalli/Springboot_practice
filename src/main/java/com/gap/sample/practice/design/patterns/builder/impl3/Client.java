package com.gap.sample.practice.design.patterns.builder.impl3;

public class Client {

    public static void main(String[] args) {

        UserDTO userDTO = new UserDTO.UserDTOBuilder()
                .withFirstName("Rakesh")
                .build();

        System.out.println(userDTO);
    }
}
