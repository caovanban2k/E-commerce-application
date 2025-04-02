package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String orderId;
    private String email;
    private List<OrderItemDTO> orderItems;
    private LocalDate localDate;
    private PaymentDTO paymentDTO;
    private Double totalAmount;
    private String orderStatus;
    private Long addressId;
}
