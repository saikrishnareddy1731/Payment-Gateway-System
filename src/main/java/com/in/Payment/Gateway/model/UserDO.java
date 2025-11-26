package com.in.Payment.Gateway.model;

public class UserDO {
    private int id;
    private String firstName;
    private String mail;

    public UserDO(int id, String firstName, String mail) {
        this.id = id;
        this.firstName = firstName;
        this.mail = mail;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
}
