package com.CISProject.LibraryService.model;

import lombok.Data;

import java.util.List;

@Data
public class Member {
    private Integer memberId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Long phoneNumber;
    private String memberShipLevel;
    private AddressDTO address;
    private List<CheckoutDTO> checkouts;
    /*private Integer memberId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }*/
}