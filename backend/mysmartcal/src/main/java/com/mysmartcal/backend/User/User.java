package com.mysmartcal.backend.User;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "user")

public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    private String phoneNumber;
    private String password;
    private Address address;
    private boolean isFreelancer;
    private Date dateOfBirth;
    private List<NotificationMessage> notifications;
    private List<NotificationMessage> messages;

    public User(String firstName, String lastName, String email, String phoneNumber, String password, Address address, boolean isFreelancer, Date dateOfBirth, List<NotificationMessage> notifications, List<NotificationMessage> messages, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.address = address;
        this.isFreelancer = isFreelancer;
        this.dateOfBirth = dateOfBirth;
        this.notifications = notifications;
        this.messages = messages;
        this.id=id;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isFreelancer() {
        return isFreelancer;
    }

    public void setFreelancer(boolean freelancer) {
        isFreelancer = freelancer;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<NotificationMessage> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<NotificationMessage> notifications) {
        this.notifications = notifications;
    }

    public List<NotificationMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<NotificationMessage> messages) {
        this.messages = messages;
    }
    public String getId() {
        return id;
    }


}
