package com.CISProject.LibraryService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name="library_member")
@Entity
@Data
public class LibraryMember {

    @Id
    @Column(name="member_id")
    private Integer memberId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_address")
    private String emailAddress;

    @Column(name="phone_number")
    private Long phoneNumber;

    @Column(name="membership_level")
    private String memberShipLevel;

    @Column(name = "address_id", insertable = false, updatable = false)
    private Long addressId;

    @ManyToOne
    @JoinColumn(name="address_id")
    private Address address;

    @OneToMany(mappedBy = "libraryMember", cascade = CascadeType.ALL)
    private List<Checkout> checkouts;

    // lombok



}
