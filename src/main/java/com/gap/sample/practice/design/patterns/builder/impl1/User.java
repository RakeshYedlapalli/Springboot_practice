package com.gap.sample.practice.design.patterns.builder.impl1;


public class User {


    private String firstName;
    private String lastName;
    private int age;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }


public static class Builder {

        private String firstName;
        private String lastName;
        private int age;


        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }

        public Builder getBuilder() {
            return this;
        }


    }

    public static void main(String[] args) {
        User user = new Builder().withFirstName("Rakesh").withAge(20).withLastName("Ch").build();
        System.out.println(user);
    }
}
