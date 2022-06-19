package com.company.dbprocessor;

import com.company.log.Logger;
import com.company.log.LoggerFactory;

import java.sql.Connection;
import java.sql.Statement;

public class CountTableCreator {
    private LoggerFactory loggerFactory = new LoggerFactory();
    private Logger LOGGER = loggerFactory.getLogger();
    /**
     * Создание таблицы для загрузки расчетов
     */
    public void createCountTable(Connection conn) {
        LOGGER.info("Создание таблицы статистик...");
        Statement statement = null;

        try {
            String query = "create table orderscount(id SERIAL primary key, orders_size int, orders_created int, orders_done int)";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            LOGGER.info("Таблица успешно создана!");

        } catch (Exception e) {
            LOGGER.error("Таблица не была создана", e);
        }
    }
}
