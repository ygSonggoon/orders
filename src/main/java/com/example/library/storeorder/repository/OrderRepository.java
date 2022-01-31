package com.example.library.storeorder.repository;

import com.example.library.storeorder.Entity.ShopOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<ShopOrder, String> {

}
