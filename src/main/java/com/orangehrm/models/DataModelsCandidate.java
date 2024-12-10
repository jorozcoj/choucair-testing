package com.orangehrm.models;

public class DataModelsCandidate {
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;

    public DataModelsCandidate(String firstName, String lastName, String email, String contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}
