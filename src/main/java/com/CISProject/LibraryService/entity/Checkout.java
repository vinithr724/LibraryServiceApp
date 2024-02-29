package com.CISProject.LibraryService.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table(name="checkout")
@Entity
@Data
public class Checkout {
    @Id
    private Integer id;
    private Long isbn;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private LibraryMember libraryMember;
    private Date checkoutDate;
    private Date dueDate;
    private boolean isReturned;
}