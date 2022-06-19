package com.company.sender;

import com.company.calculator.CalcCounts;
import com.company.dbprocessor.ConnectDB;
import com.company.dbprocessor.CountTableCreator;
import com.company.log.Logger;
import com.company.log.LoggerFactory;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Подключение к БД
 * Создание таблицы для загрузки количественных статистик
 * Запись количественных статистик в базу данных
 */
public class DbDataSender implements DataSender{
    private LoggerFactory loggerFactory = new LoggerFactory();
    private Logger LOGGER = loggerFactory.getLogger();
    @Override
    public SenderResult sendResult(CalcCounts calcResult) {
        Connection conn = null;
        Statement statement = null;

        ConnectDB connector = new ConnectDB();
        conn = connector.getConnection();

        CountTableCreator creator = new CountTableCreator();
        creator.createCountTable(conn);

        LOGGER.info("Старт записи статистик в таблицу...");
        try {
            String query = "insert into orderscount(orders_size, orders_created, orders_done) values("+
                    calcResult.getCountOfDocs().toString() + "," +
                    calcResult.getCountOrdersCreated().toString() + "," +
                    calcResult.getCountOrdersDone().toString() + ")";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            LOGGER.info("Запись статистик успешна!");
        } catch (Exception e){
            LOGGER.error("Запись не удалась.", e);
        }

        return null;
    }
}
