package com.gap.sample.practice.design.patterns.builder.impl3;

public class UserDTO {

    private String firstName;

    @Override
    public String toString() {
        return "UserDTO{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static class UserDTOBuilder {

        private String firstName;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTO build() {

            UserDTO userDTO = new UserDTO();
            userDTO.setFirstName(firstName);
            return userDTO;
        }
    }
}
