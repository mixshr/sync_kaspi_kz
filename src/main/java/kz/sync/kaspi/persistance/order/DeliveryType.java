package kz.sync.kaspi.persistance.order;

import java.util.*;

public class DeliveryType {
    public static final String PICKUP = "PICKUP";

    public static final String DELIVERY = "DELIVERY";

    public static List<String> list() {
        return Arrays.asList(PICKUP, DELIVERY);
    }
}