package com.company.grabber;

import com.company.model.Document;

import java.util.List;

/**
 * Интерфейс сборщика данных
 */
public interface DataGrabber {
    /**
     * Сборщик данных из файлов/из бд
     * @return список документов
     */
    List<Document> fetchData();
}
