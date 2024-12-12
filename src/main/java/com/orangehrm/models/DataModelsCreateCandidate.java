package com.orangehrm.models;

public class DataModelsCreateCandidate{

    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String keyWords;
    private String notesAdd;

    public DataModelsCreateCandidate(String firstName, String middleName, String lastName, String email, String contactNumber, String keyWords, String notesAdd) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.keyWords = keyWords;
        this.notesAdd = notesAdd;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
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

    public String getKeyWords() {
        return keyWords;
    }

    public String getNotesAdd() {
        return notesAdd;
    }
}
