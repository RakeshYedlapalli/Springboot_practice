package com.gap.sample.practice.datastructures.list.sort.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student implements Comparable {

    private int id;
    private String firstName;
    private String lastName;


    @Override
    public int compareTo(Object o) {
        return this.id < ((Student) o).getId() ? -1 : this.id == ((Student) o).getId() ? 0 : 1;
        //}
    }
}
