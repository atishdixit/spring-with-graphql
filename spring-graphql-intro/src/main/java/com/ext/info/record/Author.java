package com.ext.info.record;

public record Author(Integer id, String firstName, String lastName) {

    public String fullName() {
        return firstName + " " + lastName;
    }

}