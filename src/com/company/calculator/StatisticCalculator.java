package com.company.calculator;

import com.company.model.Document;

import java.util.List;

public interface StatisticCalculator {

    /**
     * Вычисление статистики списка документов
     *
     * @param documentList список документов
     * @return объект со статистикой
     */

    default CalcCounts calculateStat(List<Document> documentList) {
        return null;
    }
}
