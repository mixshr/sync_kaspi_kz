package kz.sync.kaspi.service;

import kz.sync.kaspi.api.*;
import kz.sync.kaspi.model.dto.*;
import kz.sync.kaspi.persistance.*;
import kz.sync.kaspi.persistance.order.*;
import kz.sync.kaspi.utils.*;

import java.time.*;
import java.util.*;

public class OrderService {

    private final Repository repository;

    public OrderService(String token) {
        this.repository = new Repository(token);
    }

    public OrderDto loadOrder(LocalDateTime periodStart, LocalDateTime periodEnd) {
        OrderDto orderDto = new OrderDto();

        List<String> deliveryTypes = DeliveryType.list();
        List<String> states = State.list();
        List<String> statuses = Status.list();
        String signatureRequired =  ConnectionConstants.SIGNATURE_REQUIRED;
        Long number = 0L;
        Long size = ConnectionConstants.size;
        Long start = Utils.timeToMs(periodStart);
        Long end = Utils.timeToMs(periodEnd);

        for (String deliveryType : deliveryTypes) {
            for (String state : states) {
                for (String status : statuses) {
                    String url = Utils.orderUrlBuild(number, size, state, status, start, end, deliveryType, signatureRequired);

                }
            }
        }

        return orderDto;
    }
}
