package com.example.regexandjavadoclab;

public class User {
    public String fName;
    public String lName;
    public String email;
    public String DOB;
    public int zip;

    public User() {
        this.fName = "";
        this.lName = "";
        this.email = "";
        this.DOB = "";
        this.zip = 0;
    }
    public User(String fName, String lName, String email, String DOB, int zip) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.DOB = DOB;
        this.zip = zip;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }



}
