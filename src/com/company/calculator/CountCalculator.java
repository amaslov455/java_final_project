package com.company.calculator;

import com.company.log.Logger;
import com.company.log.LoggerFactory;
import com.company.model.Document;
import com.company.model.OrderStatus;

import java.util.List;
import java.util.Objects;

/**
 * Подсчет количественной статистики из Документов
 */
public class CountCalculator implements StatisticCalculator{
    private LoggerFactory loggerFactory = new LoggerFactory();
    private Logger LOGGER = loggerFactory.getLogger();
    @Override
    public CalcCounts calculateStat(List<Document> documentList) {
        LOGGER.info("Старт расчета количественных статистик...");

        Integer countOrdersDone = 0;
        Integer countOrdersCreated = 0;
        for (int i = 0; i < documentList.size(); i++){
            if (Objects.equals(documentList.get(i).getStatus(), OrderStatus.DONE)){
                countOrdersDone ++;
            }
            else{
                countOrdersCreated++;
            }
        }

        LOGGER.info("Статистики успешно посчитаны.");
        return new CalcCounts(documentList.size(), countOrdersDone, countOrdersCreated);
    }
}
