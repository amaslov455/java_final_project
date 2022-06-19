package com.company.grabber;

import com.company.log.Logger;
import com.company.log.LoggerFactory;
import com.company.model.Document;
import com.company.model.Order;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Сборщик документов из файла
 */
public class FileDataGrabber implements DataGrabber{
    private LoggerFactory loggerFactory = new LoggerFactory();
    private Logger LOGGER = loggerFactory.getLogger();
    String filename = "data\\orders.csv";
    @Override
    public List<Document> fetchData() {
        LOGGER.info("Старт сбора данных из файла...");
        LOGGER.info("Путь к файлу: " + filename);

        List<Document> documentList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i==0){
                    i+=1;
                }
                else {
                    i+=1;
                    String[] values = line.split(",");
                    Order order = new Order(Integer.parseInt(values[0]), values[1], values[2], values[3], values[4]);
                    documentList.add(order);
                }
            }
        } catch (IOException e) {
            LOGGER.error("ОШИБКА сбора данных", e);
            throw new RuntimeException(e);
        }
        LOGGER.info("Сбор данных завершен.");
        return documentList;
    }
}
