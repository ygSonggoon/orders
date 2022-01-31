package com.example.library.storeorder.service;


public interface OrderService {
    public String createOrder(String shopCode);
    public String isDuplicateOrder(String orderNo);
}
