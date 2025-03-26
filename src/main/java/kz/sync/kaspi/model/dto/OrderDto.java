package kz.sync.kaspi.model.dto;

import kz.sync.kaspi.model.entity.*;

import java.util.*;

public class OrderDto {
    private Long count;
    private Long goodsCount;
    private Long totalSum;

    private List<OrderEntity> orders;

    public OrderDto() {
        this.count = 0L;
        this.totalSum = 0L;
        this.goodsCount = 0L;
        this.orders = new ArrayList<>();
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orders.add(orderEntity);
    }
}