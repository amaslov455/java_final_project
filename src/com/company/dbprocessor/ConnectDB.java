package com.company.dbprocessor;

import com.company.log.Logger;
import com.company.log.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private LoggerFactory loggerFactory = new LoggerFactory();
    private Logger LOGGER = loggerFactory.getLogger();
    private final String url = "jdbc:postgresql://localhost/postgres";
    private final String user = "postgres";
    private final String password = "Pudge";

    /**
     * Подключение к базе данных postgresql
     */
    public Connection getConnection(){
        LOGGER.info("Подключение к БД...");
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            if(conn != null){
                LOGGER.info("Подключение успешно!");
            }else{
                LOGGER.info("Подключение не удалось.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

}
