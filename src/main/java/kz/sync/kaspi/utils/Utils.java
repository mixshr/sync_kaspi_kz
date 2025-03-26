package kz.sync.kaspi.utils;

import java.time.*;

public class Utils {
    public static String orderUrlBuild(Long number, Long size, String state, String status, Long ge, Long le, String deliveryType, String signatureRequired) {
        StringBuilder url = new StringBuilder("/shop/api/v2/orders?");

        url.append("page[number]=").append(number);
        url.append("&page[size]=").append(size);
        url.append("&filter[orders][state]=").append(state);
        url.append("&filter[orders][creationDate][$ge]=").append(ge);
        url.append("&filter[orders][creationDate][$le]=").append(le);
        url.append("&filter[orders][status]=").append(status);
        url.append("&filter[orders][deliveryType]=").append(deliveryType);
        url.append("&filter[orders][signatureRequired]=").append(signatureRequired);
        url.append("&include[orders]=user");

        return url.toString();
    }

    public static Long timeToMs(LocalDateTime localDateTime) {
        return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli();
    }

    /*
    https://kaspi.kz/shop/api/v2/orders?page[number]=0&page[size]=20&filter[orders][state]=NEW
    &filter[orders][creationDate][$ge]=1478736000000&filter[orders][creationDate][$le]=1479945600000
    &filter[orders][status]=APPROVED_BY_BANK&filter[orders][deliveryType]=PICKUP
    &filter[orders][signatureRequired]=false&include[orders]=user
*/
}
