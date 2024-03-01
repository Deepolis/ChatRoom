package com.deepolis.serian;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //specify as Table name
public class User {
    @Id //specify as primary key
    private String username;
    private String password;

    public User() {}

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

}
