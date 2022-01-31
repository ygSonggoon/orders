package com.example.library.storeorder.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProductAttr {

    @Id
    private Integer productAttrId;
}
