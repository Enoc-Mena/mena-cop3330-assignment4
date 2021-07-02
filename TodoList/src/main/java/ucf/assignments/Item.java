package ucf.assignments;

import java.io.Serializable;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 first_name last_name
 */

public class Item implements Serializable {
    // instance variables
    private String name;

    /**
     * constructor
     * @param name
     */
    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
