package kz.sync.kaspi.persistance.order;

import java.util.*;

public class Status {
    public static final String APPROVED_BY_BANK = "APPROVED_BY_BANK";

    public static final String ACCEPTED_BY_MERCHANT = "ACCEPTED_BY_MERCHANT";

    public static final String COMPLETED = "COMPLETED";

    public static final String CANCELLED = "CANCELLED";

    public static final String CANCELLING = "CANCELLING";

    public static final String KASPI_DELIVERY_RETURN_REQUESTED = "KASPI_DELIVERY_RETURN_REQUESTED";

    public static final String RETURNED = "RETURNED";

    public static List<String> list() {
        return Arrays.asList(APPROVED_BY_BANK, ACCEPTED_BY_MERCHANT, COMPLETED, CANCELLING, CANCELLED, KASPI_DELIVERY_RETURN_REQUESTED, RETURNED);
    }
}