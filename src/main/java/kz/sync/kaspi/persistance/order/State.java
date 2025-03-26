package kz.sync.kaspi.persistance.order;

import java.util.*;

public class State {
    public static final String NEW = "NEW";

    public static final String SIGN_REQUIRED = "SIGN_REQUIRED";

    public static final String PICKUP = "PICKUP";

    public static final String DELIVERY = "DELIVERY";

    public static final String KASPI_DELIVERY = "KASPI_DELIVERY";

    public static final String ARCHIVE = "ARCHIVE";

    public static List<String> list() {
        return Arrays.asList(NEW, SIGN_REQUIRED, PICKUP, KASPI_DELIVERY, DELIVERY, ARCHIVE);
    }
}