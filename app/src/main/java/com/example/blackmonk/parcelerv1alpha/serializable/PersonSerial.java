package com.example.blackmonk.parcelerv1alpha.serializable;

import java.io.Serializable;

/**
 * Created by blackmonk on 11/21/2016.
 */

public class PersonSerial implements Serializable {
    String firstName;
    String lastName;
    int age;

    public PersonSerial(){}

    public PersonSerial(String fName, String lName, int age){
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }
}
