package kz.sync.kaspi.api;

import kz.sync.kaspi.model.dto.*;
import kz.sync.kaspi.persistance.*;
import org.springframework.web.reactive.function.client.*;

import java.util.*;

public class Repository {
    private final WebClient webClient;

    public Repository(String token) {
        this.webClient = WebClient.builder().baseUrl(ConnectionConstants.KASPI_HOST).defaultHeaders(it -> it.set("X-Auth-Token", token)).build();
    }

    public List<Map<String, Object>> loadOrders(String url) {
        return null;
    }
}