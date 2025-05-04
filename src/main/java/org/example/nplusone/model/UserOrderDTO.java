package org.example.nplusone.model;

import lombok.Data;

@Data
public class UserOrderDTO {
    private Long userId;
    private String userName;
    private Long orderId;
    private String product;
}
