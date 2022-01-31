package com.example.library.storeorder.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ShopOrder {
    @Id
    private String shopOrderNo;

    private String saleDate;
    private String shopCode;
    private String orderChannel;

}
