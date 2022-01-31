package com.example.library.storeorder.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(indexes = @Index(name = "product_multiple_index", columnList = "shopCode, saleDate"))
public class MainProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mainProductId;

    private String shopCode;
    private String saleDate;

    private Integer price;
    private Integer discountPrice;

    @OneToMany
    @JoinColumn (name = "main_product_id")
    private List<SideProduct> sideProducts;
    @OneToMany
    @JoinColumn (name = "main_product_id")
    private List<ProductAttr> productAttrs;

    private boolean isCouponUsed;
}
