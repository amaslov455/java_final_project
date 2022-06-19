package com.company.model;

/**
 * Enum, который хранит статусы приказов
 */
public enum OrderStatus {
    CREATED("СОЗДАН"), DONE("ИСПОЛНЕН");

    private final String order;

    OrderStatus(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public static OrderStatus fromString(String text) {
        for (OrderStatus b : OrderStatus.values()) {
            if (b.order.equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }
}
