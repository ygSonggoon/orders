package com.example.library.storeorder.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SideProduct {

    @Id
    private Integer sideProductId;

    @Column(name = "main_product_id")
    private String mainProductId;
}
