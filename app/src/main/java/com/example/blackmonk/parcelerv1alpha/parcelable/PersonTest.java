package com.example.blackmonk.parcelerv1alpha.parcelable;

import org.parceler.Parcel;

/**
 * Created by blackmonk on 11/21/2016.
 */

@Parcel
public class PersonTest {

    String firstName;
    String lastName;
    int age;

    public PersonTest(){}

    public PersonTest(String fName, String lName, int age){
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
