package com.example.git.demo;

public class User {
    private int userId;
    private String usernName;
    private String userEmail;
    private int userAge;

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsernName() {
        return usernName;
    }

    public void setUsernName(String usernName) {
        this.usernName = usernName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
