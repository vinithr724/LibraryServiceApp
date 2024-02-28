package com.CISProject.LibraryService.model;
import lombok.Data;

import java.util.Date;

@Data
public class CheckoutDTO {
    private Integer id;
    private Long isbn;
    private Date checkoutDate;
    private Date dueDate;
    private boolean isReturned;
}